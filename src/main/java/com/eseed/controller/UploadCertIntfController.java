package com.eseed.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.repo.GetCropYearRepo;
import com.eseed.service.impl.FileUploadService;

@Controller
public class UploadCertIntfController {
    @Autowired
    private GetCropYearRepo cropYearRepo;

    @Autowired
    private FileUploadService fileUploadService ;

    @PreAuthorize("hasAuthority('15')")
    @GetMapping("/UpLoadCertIntf")
    public String showUploadPage(Model model, HttpSession httpSession) {
        try {
            String role = (String) httpSession.getAttribute("role");
            if (!"15".equals(role)) {
                model.addAttribute("message", "You are not Eligible to access this Page");
                return "unauthorized";
            }

            List<ActiveSeasonProjection> activeSeasons = cropYearRepo.getAllSeason();
            model.addAttribute("activeseasons", activeSeasons);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("An unexpected error occurred");
        }

        return "rbkroles/uploadCertIntf";
    }

    @PreAuthorize("hasAuthority('15')")
    
    @RequestMapping(value = "/uploadCertificate", method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam("file") MultipartFile file,
                                    @RequestParam("cropyear") String cropyear,
                                    HttpSession httpSession, Model model,HttpServletRequest request) {
        try {
            // Validate file size
            if (file.getSize() > 9 * 1024 * 1024) {
                model.addAttribute("message", "File size should be less than 9 MB.");
                return "rbkroles/uploadCertIntf";
            }

            // Split cropyear into season and crop year value
            String[] cropYearParts = cropyear.split("@");
            String season = cropYearParts[0];
            String cropYearValue = cropYearParts[1];
            // Get session attributes
            String dcode = (String) httpSession.getAttribute("dcode");
            String user = (String) httpSession.getAttribute("userid");

            // Convert file to base64 and upload to the database
            String base64File = fileUploadService.convertToBase64(file);
            String status = fileUploadService.addUploadfiles(Integer.parseInt(dcode), Integer.parseInt(cropYearValue),
                    season, request.getRemoteAddr(), base64File, user);

            model.addAttribute("message", status);
            return "rbkroles/uploadCertIntf";

        } catch (Exception e) {
            model.addAttribute("message", "Error uploading file: " + e.getMessage());
            return "rbkroles/uploadCertIntf";
        }
    }
}
