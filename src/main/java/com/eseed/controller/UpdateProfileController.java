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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eseed.entity.UpdateProfileEntity;
import com.eseed.entity.User_registration;
import com.eseed.repo.UpdateProfileRepo;
import com.eseed.repo.User_registrationRepo;
import com.itextpdf.text.log.SysoCounter;


@Controller
public class UpdateProfileController {
	
	
	
	
	@Autowired
	UpdateProfileRepo userDeactivation;
	
	@Autowired
	User_registrationRepo repo;
	

	@PreAuthorize("hasAuthority('11')")
	@GetMapping("/updateProfile")
	public String changePassword(HttpSession session,Model model) {
		String userid=session.getAttribute("userid").toString();
		System.out.println("userid----: "+userid);
		 List<UpdateProfileEntity> list =userDeactivation.getData(userid);
		model.addAttribute("aadhaar",  list.get(0).getAadhaar());
		model.addAttribute("emailid",  list.get(0).getEmailid());
		model.addAttribute("mobile",  list.get(0).getMobile());
		model.addAttribute("name",  list.get(0).getName());
		return "ddap/updateProfile";
	}
	
	@PreAuthorize("hasAuthority('11')")
	@PostMapping("/updateProfilesForVro")
	public String pwdUpdated(@RequestParam("name") String name,@RequestParam("mobile") String mobile,@RequestParam("email") String email,@RequestParam("maskedId") String aadhaar,Model model,HttpSession session,HttpServletRequest request,RedirectAttributes redirectAttributes) {
		if( name == null || name.equals("") || mobile.equals("") || mobile==null    || email==null || email.isEmpty() || aadhaar==null || aadhaar.equals("") || aadhaar.length()!=12 || mobile.length()!=10  ) {
	    	return "ErrorPage";
	    }
		String userid=session.getAttribute("userid").toString();
   System.out.println("userid--------->"+userid );
  
    String role =(String) session.getAttribute("role").toString();
    
    System.out.println("role==>"+role);
    System.out.println("name----------->"+name);
    System.out.println("mobile----------->"+mobile);
    System.out.println("email----------->"+email);
    System.out.println("aadhaar----------->"+aadhaar);
    		  int status =userDeactivation.userUpdationForVro(name,mobile,email,aadhaar,userid,Integer.parseInt(role));
    		  System.out.println("status==>"+status);
    		  if(status !=0) {
    			  redirectAttributes.addFlashAttribute("msg", "Profile Updated successfully");
    		  }
    		  else{
    			  redirectAttributes.addFlashAttribute("msg", "Failed to Update");
    		  }
    	
    
	return "redirect:/updateProfile";
	}
	
}
