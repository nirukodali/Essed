package com.eseed.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.entity.MandalFhorestpwd;
import com.eseed.entity.MandalsFusersho;
import com.eseed.entity.User_registration;
import com.eseed.projection.DistrictCsProjection;
import com.eseed.repo.MandalRepositoryFhorestpwd;
import com.eseed.repo.MandalsFhorestpwdRepository;
import com.eseed.repo.UserRegistrationUpdate;
import com.eseed.repo.UserRegistrationUpdateRepo;
import com.eseed.repo.User_registrationRepo;
import com.eseed.repo.User_registrationRepository;
import com.eseed.repo.VillageRepositoryFhorestpwd;
import com.eseed.service.ChangePasswordToSha;
import com.eseed.service.impl.UserRegistrationUpdateServiceImpl;
import com.eseed.service.impl.User_registrationServiceImpl;
@Controller
public class Ada1comagController {
	
	
	
	@Autowired
	private User_registrationRepository user_registrationRepository;
	
	@Autowired
	private  User_registrationRepo   userregestrationrepo;
	
	
	 @GetMapping("/update-password")
	    public String showPasswordUpdateForm(Model model) {
	       
		 User_registration registration=new User_registration();
		 model.addAttribute("passwordUpdateForm", registration);
	        return "ada1comag/changepassword";  // Thymeleaf template name
	    }
	 
	 
	 @PostMapping("/update-password")
	    public String updatePassword(@ModelAttribute("passwordUpdateForm") @Valid User_registration user_registration, 
	                                 BindingResult result) {
		 
		 System.out.println("user_registration-------------->"+user_registration.toString());
	        if (result.hasErrors()) {
	            return "password-update";  // Return to the form if validation fails
	        }
	        // Handle password update logic here
	        return "redirect:update-password";  // Redirect on success
	    }
	 
	 
	 
	 @Autowired 
	    private User_registrationServiceImpl  user_registrationService;
		
		@Autowired 
	    private UserRegistrationUpdateServiceImpl  userRegistrationUpdateService;
		
		
		@Autowired 
		private UserRegistrationUpdateRepo  registrationUpdateRepo; 
		@Autowired
		ChangePasswordToSha  changepasswordsha;
		
		@PreAuthorize("hasAuthority('11')")
		@GetMapping("/horesetpwd")
		public String findAl(Model theModel)
		{
		    return "adaroles/horesetpwd";   
		} 
		
		@PreAuthorize("hasAuthority('11')")
		@PostMapping("/posthoresetpwd")
		public String fin(Model theModel, @RequestParam("username") String username,
				@RequestParam("newpassword") String newpaessword,
				@RequestParam("retypenewpassword") String retypenewpassword, HttpSession httpSession) {  
			
			
			String md5 = changepasswordsha.encode(newpaessword);
			//System.out.println("-------------------------------------------------------------->"+md5);
			String dcode =(String) httpSession.getAttribute("dcode");
			String userId1 = (String)httpSession.getAttribute("userId");
			
		//	System.out.println("newpassword-"+newpassword);
			System.out.println("retypenewpassword"+retypenewpassword);
			
			if(!(newpaessword.equals(retypenewpassword))) {
				theModel.addAttribute("msg", "Password and Retype Password are not Matching/User Name does not exists");
				System.out.println("if");
			}else {
				String userId = user_registrationService.findAll(username);
				
				if(userId != null) {
					int updateUserReg = userRegistrationUpdateService.findAll(md5,username,dcode);
					System.out.println("userId------------------------->"+userId);
					if(updateUserReg > 0) {
						String result="The Reset pasword was done successfully!";
						System.out.println("userid--->"+userId1);
						System.out.println("username--->"+username);
						System.out.println("dcode--->"+dcode);
						int insertTracer = userRegistrationUpdateService.insertTracer(userId1, username, dcode);
						System.out.println("count-->"+insertTracer);
						
					}
				}else {
					theModel.addAttribute("msg", "User Name does not exists");
				}
			}
			
			
			return "adaroles/horesetpwd";

		}
		
		
		@Autowired
		private MandalRepositoryFhorestpwd mandalRepositoryFhorestpwd;
		
		@Autowired
		private VillageRepositoryFhorestpwd fhorestpwd;

		@Autowired
		private MandalsFhorestpwdRepository mandalsFhorestpwdRepository;

		
		@PreAuthorize("hasAuthority('11')")
		@GetMapping("/horesetpwdDao")
		public String findAl(Model theModel, HttpSession httpSession) {
			String dcode = (String) httpSession.getAttribute("dcode");
			System.out.println("dcode"+dcode);
			List<MandalFhorestpwd> mandals = mandalRepositoryFhorestpwd.getMandals(Integer.parseInt(dcode));
			theModel.addAttribute("mandal", mandals);
			
			
			
			List<DistrictCsProjection>  districts = mandalRepositoryFhorestpwd.getDistricts();
			theModel.addAttribute("districts", districts);

			return "horoles/horesetpwddao";
		}

		@PreAuthorize("hasAuthority('11')")
		@GetMapping("/getUseridFho/{mandalname}")
		@ResponseBody
		public List<MandalsFusersho> getMandalnamesFho(@PathVariable("mandalname") String district) {
		    List<MandalsFusersho> mandalsFho = null;
		    try {
		    	mandalsFho  = mandalsFhorestpwdRepository.getUsersDistricts(district);
//		    	mandalsFho  = mandalsFhorestpwdRepository.getUsers(mandalname);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return mandalsFho;
		}

		@PreAuthorize("hasAuthority('11')")
		@PostMapping("/posthoresetpwdDao")
		public String fina(Model theModel, @RequestParam("username") String username,
				@RequestParam("newpassword") String newpaessword,
				@RequestParam("retypenewpassword") String retypenewpassword,   @RequestParam("mandalname") String  mandalname,  HttpSession httpSession) {
			String md5 = changepasswordsha.encode(newpaessword);
			String dcode = (String) httpSession.getAttribute("dcode");
			String userId1 = (String) httpSession.getAttribute("userid");
			
			System.out.println("mandalname----------->"+mandalname);
			
			System.out.println("dcode------------------->"+dcode);
			System.out.println("userId1------------------->"+userId1);
			System.out.println("newpaessword------------>"+newpaessword);
			System.out.println("retypenewpassword------------>"+retypenewpassword);
			System.out.println("username------------>"+username);
			
			
			
   
			
			
			
		Object resulted = userregestrationrepo.findDistrictByUserId(username);

		        // Check if the result is not empty
		String districtCode=  (String) resulted;
		      
		       System.out.println("district dcode------------->"+districtCode);
		       String prefix = "DAO_";
		       String districtcodefromuser="";
		        // Check if the string starts with the prefix "DAO_"
		        if (username.startsWith(prefix)) {
		            // Extract everything after the "DAO_" prefix
		        	districtcodefromuser=   username.substring(prefix.length());  // Skip the "DAO_" part
		        }
		        System.out.println("districtcodefromuser--------------->"+districtcodefromuser);
		        System.out.println("districtdcode--------------->"+districtCode);
	
		        
		        if(!(districtCode.equalsIgnoreCase(districtcodefromuser))){
		        	System.out.println("dcode not be same --------------------->");
					theModel.addAttribute("msg", "dcode not be same ");
	
		        }
		        
		        
		        if(!(mandalname.equals(districtcodefromuser))) {
		            throw new IllegalArgumentException("District name and district code from user cannot be the same.");
		        }
			

			if (!(newpaessword.equals(retypenewpassword))) {
				System.out.println(":is called--------------->");
				theModel.addAttribute("msg", "Password and Retype Password are not Matching/User Name does not exists");
			} else {
				String userId = user_registrationService.findAll(username);
				if (userId != null) {
					int updateUserReg = userRegistrationUpdateService.findAll(md5, username, dcode);
					if (updateUserReg > 0) {
						String result = "The Reset pasword was done successfully!";
						int insertTracer = userRegistrationUpdateService.insertTracer(userId1, username, dcode);
					}
				} else {
					theModel.addAttribute("msg", "User Name does not exists");
				}
			}
			return "redirect:/horesetpwdDao";
		}

		
		
		
		@GetMapping("/users/{dcode}")
		@ResponseBody
	    public List<Map<String, Object>> getUsersByDistrictCode(@PathVariable String dcode) {
	        return registrationUpdateRepo.getUsersByDistrictCode(dcode);
	    }
		
		

}
