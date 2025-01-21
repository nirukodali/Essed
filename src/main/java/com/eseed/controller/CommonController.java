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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.repo.SeasonCropBookedExtentRepo;
import com.eseed.service.UserService;
import com.eseed.dto.UserActiveDeactiveDto;
import com.eseed.projection.CropYearProjection;
import com.eseed.projection.DistrictProjections;
import com.eseed.projection.MasterProjections;
import com.eseed.repo.CropYearRepository;

@Controller
public class CommonController {

	
	
	@Autowired
	private CropYearRepository cropyearRepository;

	@Autowired
	private com.eseed.repo.DistrictRepository distrepo;
	
	
	 @Autowired
	    private UserService userService;
	

@Autowired
private	SeasonCropBookedExtentRepo seasonCropBookedExtentRepo;

	@GetMapping("/farmerecrop")
	public String getFarmerDetails(HttpSession httpSession, Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");
//		System.out.println("dcode" + dcode);

		List<DistrictProjections> dist = distrepo.getList();
//		System.out.println("dist" + dist.size());
		List<CropYearProjection> activeSeasons = cropyearRepository.getCropYear();
		model.addAttribute("activeSeasons", activeSeasons);
		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);
		
		
		//System.out.println("dist---------------->"+dist);
		//System.out.println("dcode---------------->"+dcode);


		return "horoles/userregestrationdetails ";
	}		
	
	
	@ResponseBody
	@GetMapping("/getAllMandals")
	public List<MasterProjections> getMandals(Integer dcode) {
		List<MasterProjections> list = seasonCropBookedExtentRepo.getAllMandals(dcode);
		return list;
	}
	
	@ResponseBody
	@GetMapping("/getAllVillages")
	public List<MasterProjections> getVillages(Integer dcode, Integer mcode) {
		List<MasterProjections> list = seasonCropBookedExtentRepo.getAllVillages(dcode, mcode);
		return list;
	}
	
	
	
	@GetMapping("/getuserRegestrationreport")
	public String userRegestraionReport(HttpSession httpSession, Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");
		List<DistrictProjections> dist = distrepo.getList();
		List<CropYearProjection> activeSeasons = cropyearRepository.getCropYear();
		model.addAttribute("activeSeasons", activeSeasons);
		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);
		return "horoles/userregestrationreport";
	}
	
	
	@PostMapping("/farmerecropdata")
	public String getFarmerDetailsData(HttpSession httpSession, Model model,HttpServletRequest httpServletRequest) {
		System.out.println("cropyear----------->"+httpServletRequest.getParameter("cropyear"));	
		System.out.println("selectedDist----------->"+httpServletRequest.getParameter("selectedDist"));	
		System.out.println("selectedMand----------->"+httpServletRequest.getParameter("selectedMand"));	
		System.out.println("actId----------->"+httpServletRequest.getParameter("actId"));	
		String cropyear=httpServletRequest.getParameter("cropyear");
		String district=httpServletRequest.getParameter("selectedDist");
		String mandal =httpServletRequest.getParameter("selectedMand");
		
		String actid=httpServletRequest.getParameter("actId");
		
	

        // Now pass these parsed values to the service
        // userService.getUserDetails(district, mandal, actid);		
         
         
         List<Object[]> results =  userService.getUserDetails(district, mandal, actid);
         
         model.addAttribute("results", results);
         model.addAttribute("cropyear", cropyear);
         model.addAttribute("actid", actid);

         
         if (results.isEmpty()) {
             System.out.println("No results found for the given parameters.");
         }
     	return "horoles/userregestrationdetailsData";         
		
	}
	
	
	@PostMapping("/farmerecropdataSubmit")
	public String farmerecropdataSubmit(@RequestBody List<UserActiveDeactiveDto> list,HttpSession httpSession, Model model,HttpServletRequest httpServletRequest) {
        String cropyear = httpServletRequest.getParameter("cropyear");
        String actid = httpServletRequest.getParameter("actid");
        System.out.println("cropyear------------------->"+cropyear);
        System.out.println("actid------------------->"+actid);
        String status="A";
		for(UserActiveDeactiveDto obj :list) {
			System.out.println("------>"+obj.toString());
		//	if(obj.getActid()=="A" || obj.getActid().equalsIgnoreCase("A"))
			//	status="D";
			userService.updateStatus(obj.getActid(),obj.getDistrict(),obj.getMandal(),obj.getVillage(),obj.getCropyear());
		//}
		
	
		
	}
	
	
	
	
//	@GetMapping("/getUserDetails")
//    public List<Object[]> getUserDetails(@RequestParam String dcode,
//                                         @RequestParam(required = false) String mcode,
//                                         @RequestParam String actId) {
//        return userService.getUserDetails(dcode, mcode, actId);
//    }
	
		return "redirect:/farmerecrop";       
	}
}
