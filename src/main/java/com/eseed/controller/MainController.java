package com.eseed.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.eseed.captcha.CaptchaDetails;
import com.eseed.captcha.CaptchaGenerator;
import com.eseed.config.Encrypt;
import com.eseed.config.UserPrincipal;
import com.eseed.dto.AuthenticationRequest;
import com.eseed.entity.ActiveSeason;
import com.eseed.entity.AppUser;
import com.eseed.entity.User_registration;
import com.eseed.entity.VillageSecRevEntity;
import com.eseed.entity.WbMaster;
import com.eseed.repo.EmpRepo;
import com.eseed.repo.IndentEntryRepo;
import com.eseed.repo.UserRegRepo;
import com.eseed.repo.User_registrationRepository;
import com.eseed.repo.VillageSecRevRepository;
import com.eseed.service.LastLoginService;
import com.eseed.service.WbMasterService;
import com.eseed.service.impl.ActiveSeasonServiceImpl;
import com.eseed.util.ECropUtility;

@Controller
public class MainController {

	@Autowired
	private Encrypt encrypt;

	@Autowired
	WbMasterService wbMasterService;

	@Autowired
	UserRegRepo userRegRepo;
	@Autowired
	private VillageSecRevRepository villageSecRevRepository;
//	@Autowired
//	UserTypesEntityRepo userTypesEntityRepo;
	@Autowired
	private IndentEntryRepo lastLoginRepo;

	@Autowired
	private ActiveSeasonServiceImpl activeSeasonService;
	@Autowired
	private User_registrationRepository user_registrationRepository;
	
	@Autowired
	private EmpRepo empRep;

	String time = null;

	CaptchaDetails detail;
	@Autowired
	private CaptchaGenerator captchagenerator;

	@GetMapping("/login-auth")
	public String homePage(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request, HttpSession httpSession) {

//		System.out.println("calling-------->");
		ActiveSeason active = null;
		WbMaster wbMaster = null;
		List<VillageSecRevEntity> villageSecRevEntity = null;
		ECropUtility.setSessionData();

		List<ActiveSeason> cropYearActiveSeasonList = activeSeasonService.listAll();

		httpSession.setAttribute("ACTIVEYEAR", cropYearActiveSeasonList.get(0).getCropyear());
		httpSession.setAttribute("seasonActive", cropYearActiveSeasonList.get(0).getSeason());

//		System.out.println("authentication=>");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		System.out.println("authentication=>" + authentication.toString());
		User_registration registration = new User_registration();
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

//		System.out.println("-----------------" + userPrincipal.getPassword());
		httpSession.setAttribute("dcode", userPrincipal.getDcode());

//            System.out.println("dcode------->"+userPrincipal.getDcode());
		httpSession.setAttribute("mcode", userPrincipal.getMandalCode());
		httpSession.setAttribute("wbdcode", userPrincipal.getwbDcode());
		httpSession.setAttribute("wbmcode", userPrincipal.getwbMcode());
		httpSession.setAttribute("name", userPrincipal.getUsername());
		httpSession.setAttribute("role", userPrincipal.getTypeUser());
		// httpSession.setAttribute("wbvcode", userPrincipal.getwbvcode());
		httpSession.setAttribute("vscode", userPrincipal.getVillCode());
		httpSession.setAttribute("userid", userPrincipal.getUserid());
//		System.out.println("last login----------->" + lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
		//time = lastLoginRepo.getLastLogin(userPrincipal.getUserid());

//		System.out.println("userid--------->" + userPrincipal.getTypeUser());  

		httpSession.setAttribute("ACTIVEYEAR", cropYearActiveSeasonList.get(0).getCropyear());
		httpSession.setAttribute("seasonActive", cropYearActiveSeasonList.get(0).getSeason());

		String userType = userPrincipal.getTypeUser();

		if (userPrincipal.getPassword().equals("103657e83fbc3a31181c3263965c2466")) {
			if (!userPrincipal.getTypeUser().equals("5") && !userPrincipal.getTypeUser().equals("17")) {
				model.addAttribute("login",
						"As this is your first login, Please contact your admin to change your passsword");
				httpSession.setAttribute("chk", "firstTime");
				return "changePasswordRequest";
			}
			if (userType != null && "17".equalsIgnoreCase(userType)) {
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));

			} else if (userType != null && ("5".equalsIgnoreCase(userType) || "22".equalsIgnoreCase(userType)
					|| "2".equalsIgnoreCase(userType))) {
				wbMaster = wbMasterService.getWbMasterDetailsForMandal(userPrincipal.getwbMcode(),
						userPrincipal.getwbDcode());
				if (wbMaster != null) {

					httpSession.setAttribute("wbedname", wbMaster.getWbedname());
					httpSession.setAttribute("wbemname", wbMaster.getWbemname());
					httpSession.setAttribute("wbevname", wbMaster.getWbevname());
					getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), wbMaster.getWbedname(),
							wbMaster.getWbemname(), "", httpSession,
							lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
				}

			}

			return "home";
		}

		else {
			httpSession.setAttribute("chk", "notFirstTime");
			// httpSession.setAttribute("ACTIVEYEAR", ECropUtility.getActiveYear());

			String user = userPrincipal.getUsername();
			// villageSecRevEntity =
			// villageSecRevRepository.getWbMasterDetailsForVillage(Integer.parseInt(userPrincipal.getvillCode()),userPrincipal.getwbMcode(),userPrincipal.getwbDcode());

			// UserRegEntity entity=userRegRepo.findByUserid(userPrincipal.getUsername());

			if (userType != null && "17".equalsIgnoreCase(userType) || "38".equalsIgnoreCase(userType) || "57".equalsIgnoreCase(userType) || "55".equalsIgnoreCase(userType) ||
					"48".equalsIgnoreCase(userType)  || "58".equalsIgnoreCase(userType)|| "59".equalsIgnoreCase(userType)  || "15".equalsIgnoreCase(userType) || "11".equalsIgnoreCase(userType)) {
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));

			} else if (userType != null && ("5".equalsIgnoreCase(userType) || "22".equalsIgnoreCase(userType)
					|| "2".equalsIgnoreCase(userType))) {
//				wbMaster = wbMasterService.getWbMasterDetailsForMandal(userPrincipal.getwbMcode(),
//						userPrincipal.getwbDcode());
//				if (wbMaster != null) {
//
//					httpSession.setAttribute("wbedname", wbMaster.getWbedname());
//					httpSession.setAttribute("wbemname", wbMaster.getWbemname());
//					httpSession.setAttribute("wbevname", wbMaster.getWbevname());
//					getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), wbMaster.getWbedname(),
//							wbMaster.getWbemname(), "", httpSession,
//							lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
//				}

			} else if ("30".equalsIgnoreCase(userType)) {
				villageSecRevEntity = villageSecRevRepository.getWbMasterDetailsForVillageVro(
						Integer.parseInt(userPrincipal.getvillCode()), userPrincipal.getwbMcode(),
						userPrincipal.getwbDcode());
				httpSession.setAttribute("wbedname", villageSecRevEntity.get(0).getWbedname());
				httpSession.setAttribute("wbemname", villageSecRevEntity.get(0).getWbemname());
				httpSession.setAttribute("wbevname", villageSecRevEntity.get(0).getWbvname());
				httpSession.setAttribute("wbvcode", userPrincipal.getwbvcode());
				httpSession.setAttribute("vcode", userPrincipal.getwbvcode());
				
				httpSession.setAttribute("vscode", villageSecRevEntity.get(0).getVscode());
//				httpSession.setAttribute("mcode", userPrincipal.get);
				httpSession.setAttribute("wbdcode", villageSecRevEntity.get(0).getWbdcode());
				httpSession.setAttribute("wbmcode", villageSecRevEntity.get(0).getWbmcode());
				httpSession.setAttribute("wbvcode", villageSecRevEntity.get(0).getVcode());
				httpSession.setAttribute("dcode", userPrincipal.getDcode());

				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(),
						villageSecRevEntity.get(0).getWbedname(), villageSecRevEntity.get(0).getWbemname(),
						villageSecRevEntity.get(0).getWbvname(), httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));

			} else if (userType != null && ("25".equalsIgnoreCase(userType))) {
				villageSecRevEntity = villageSecRevRepository.getWbMasterDetailsForRBk(
						Integer.parseInt(userPrincipal.getvillCode()), userPrincipal.getwbMcode(),
						userPrincipal.getwbDcode());

				httpSession.setAttribute("wbedname", villageSecRevEntity.get(0).getWbedname());
				httpSession.setAttribute("wbemname", villageSecRevEntity.get(0).getWbemname());
				httpSession.setAttribute("wbevname", villageSecRevEntity.get(0).getWbvname());
//				userPrincipal.getName()
//				System.out.println("----villageSecRevEntity.get(0).getWbmcode()---"+userPrincipal.getMandalCode());
				getHeaderMessage(empRep.getEmpName(Integer.parseInt(userPrincipal.getVillCode()),Integer.parseInt(userPrincipal.getMandalCode().toString())), userPrincipal.getUsername(),
						villageSecRevEntity.get(0).getWbedname(), villageSecRevEntity.get(0).getWbemname(),
						villageSecRevEntity.get(0).getWbvname(), httpSession,lastLoginRepo.getLastLogin(userPrincipal.getUserid()));

			} else if (userType != null && "18".equalsIgnoreCase(userType)) {
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			} else if (userType != null && "46".equalsIgnoreCase(userType)) {
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			} else if (userType != null && "9".equalsIgnoreCase(userType)) {
				String distList = wbMasterService.findDCode(Integer.parseInt(userPrincipal.getDcode()));
				httpSession.setAttribute("wbdcode", userPrincipal.getwbDcode());
				httpSession.setAttribute("wbedname", distList);
				httpSession.setAttribute("dcode", userPrincipal.getDcode());
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distList, "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			}else if (userType != null && "51".equalsIgnoreCase(userType)) {
				String distList = wbMasterService.findDCode(Integer.parseInt(userPrincipal.getDcode()));
				httpSession.setAttribute("wbdcode", userPrincipal.getwbDcode());
				httpSession.setAttribute("wbedname", distList);
				httpSession.setAttribute("dcode", userPrincipal.getDcode());
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distList, "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			}
			else if (userType != null && "21".equalsIgnoreCase(userType)) {
				httpSession.setAttribute("dcode", userPrincipal.getDcode());
				List<String> distList = wbMasterService.findDistByCode(userPrincipal.getwbDcode());
				String distName = null;
				if (distList.size() > 0) {
					distName = distList.get(0);
				}
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distName, "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			}

			else if (userType != null && ("31".equalsIgnoreCase(userType) || "56".equalsIgnoreCase(userType) ||"19".equalsIgnoreCase(userType) || "53".equalsIgnoreCase(userType)
					|| "44".equalsIgnoreCase(userType) || "45".equalsIgnoreCase(userType))) {
//            	httpSession.setAttribute("wbdcode", userPrincipal.getwbDcode());
//            	System.out.println("wbdcode------"+ userPrincipal.getwbDcode());

//            	httpSession.setAttribute("wbdcodeJc",wbMasterService.findDCodeJc( userPrincipal.getUserid()));
//            	System.out.println("wbMasterService.findDCodeJc( userPrincipal.getUserid())---"+wbMasterService.findDCodeJc( userPrincipal.getUserid()));
				List<String> distList = wbMasterService.findDistByCode(userPrincipal.getwbDcode());
				String distName = null;
				if (distList.size() > 0) {
					distName = distList.get(0);
				}
				httpSession.setAttribute("dcode", userPrincipal.getDcode());
				httpSession.setAttribute("mcode", userPrincipal.getMandalCode());
				getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distName, "", "", httpSession,
						lastLoginRepo.getLastLogin(userPrincipal.getUserid()));
			}

			httpSession.getId();
//			System.out.println("sid" + httpSession.getId());
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("JSESSIONID")) {
//						System.out.println("Cookie Value: " + cookie.getValue());
						if (!httpSession.getId().equals(cookie.getValue())) {
//							System.out.println("logout");
							return "logout";
						}
					}
				}
			}

			return "home";
		}
	}

	@GetMapping("/")
	public String loginPage(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request, HttpSession session, HttpServletResponse response,
			@ModelAttribute("appuser") AppUser appuser, BindingResult bindingResult) {
		// System.out.println("password----------------->"+password);
//		System.out.println("password----------------->" + request.getParameter("password"));
		model.addAttribute("appuser", new AppUser());

		// Generate a new CAPTCHA
		detail = captchagenerator.generateCaptcha();
		model.addAttribute("usercaptcha", detail.getCaptcha());
		session.setAttribute("answer", detail.getAnswer());
//		System.out.println("called");
		Integer answer = (Integer) session.getAttribute("answer");

		if (answer == null || !answer.equals(appuser.getAnswer())) {
			bindingResult.rejectValue("answer", "InvalidCaptcha", "Captcha should be equal to answer.");
		}
		String isCaptchaError = request.getParameter("captcha_error");
		String isLoginError = request.getParameter("error");
		if (Objects.nonNull(isLoginError) && "true".equalsIgnoreCase(isLoginError)) {
			model.addAttribute("msg", "Invalid Credentials");
		} else if (Objects.nonNull(isCaptchaError) && "true".equalsIgnoreCase(isCaptchaError)) {
			model.addAttribute("msg", "Invalid Captcha");
		}
		return "login";

	}

	@PreAuthorize("hasAuthority('25') || hasAuthority('30') || hasAuthority('5') || hasAuthority('19') || hasAuthority('17') "
			+ "|| hasAuthority('22') || hasAuthority('9') || hasAuthority('11') || hasAuthority('16') || hasAuthority('19') || hasAuthority('18') || hasAuthority('21')"
			+ " || hasAuthority('31') || hasAuthority('44') || hasAuthority('45') || hasAuthority('46') || hasAuthority('47') || hasAuthority('2') || hasAuthority('55')"
			+ "|| hasAuthority('48')|| hasAuthority('58') || hasAuthority('15') || hasAuthority('11')")
	@GetMapping("/home")
	public String home(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request, HttpSession session) {

		return "home";

	}

	public void getHeaderMessage(String name, String typeName, String district, String mandal, String village,
			HttpSession httpSession, String time) {

		String headerMessage = String.format(
				"Welcome to %s, %s, %s %s %s	\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0	Last Login : %s",
				name, typeName, getVillage(village), getMandal(mandal), getDistrict(district), time);
		httpSession.setAttribute("headerMessage", headerMessage);
	}

	public String getVillage(String village) {
		return village != null && !village.isEmpty() ? "RSK :: " + village + ", " : "";
	}

	public String getMandal(String mandal) {
		return mandal != null && !mandal.isEmpty() ? "Mandal :: " + mandal + ", " : "";
	}

	public String getDistrict(String district) {
		return district != null && !district.isEmpty() ? " District :: " + district : "";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session, HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) {
		// return "redirect /login?logout";
		//// System.out.println("username before
		// logout"+session.getAttribute("username"));

		authentication = SecurityContextHolder.getContext().getAuthentication();
		String userid = (String) session.getAttribute("userid");
//		System.out.println("userid---------------"+userid);
		try {
			lastLoginRepo.updateLastLogin(userid);
		} catch (Exception e) {
//			System.out.println(e);
		}

		String username = authentication.getName();

		if (username != null) {
			Cookie cookie = new Cookie("JSESSSIONID", null);
			cookie.setMaxAge(0);
			cookie.setSecure(true);
			cookie.setHttpOnly(true);
			cookie.setPath("/");
			response.addCookie(cookie);

		}
		new SecurityContextLogoutHandler().logout(request, response, authentication);
		session = request.getSession();
		// System.out.println("username"+session.getAttribute("username"));
		return "redirect:/";
	}

}




//old code

/*package com.ecrops.controller;

import javax.servlet.http.Cookie;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.ecrops.config.Encrypt;
import com.ecrops.config.UserPrincipal;
import com.ecrops.dto.AuthenticationRequest;
import com.ecrops.entity.ActiveSeason;
import com.ecrops.entity.UserRegEntity;
import com.ecrops.entity.VillageSecRevEntity;
import com.ecrops.entity.WbMaster;
import com.ecrops.repo.UserRegRepo;
import com.ecrops.repo.VillageSecRevRepository;
import com.ecrops.service.WbMasterService;
import com.ecrops.service.impl.ActiveSeasonServiceImpl;
import com.ecrops.util.ECropUtility;
import java.util.List;
import java.util.Objects;


@Controller
public class MainController {

	@Autowired
	private Encrypt encrypt;

	@Autowired
	WbMasterService wbMasterService;

	@Autowired
	UserRegRepo userRegRepo;
	@Autowired
	 private VillageSecRevRepository villageSecRevRepository;
//	@Autowired
//	UserTypesEntityRepo userTypesEntityRepo;
	
	@Autowired
	private ActiveSeasonServiceImpl activeSeasonService;

	
	@GetMapping("/login-auth")
	public String homePage(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request ,HttpSession
			httpSession) {
		ActiveSeason active=null;
		 WbMaster wbMaster = null;
		 List<VillageSecRevEntity> villageSecRevEntity=null;
         ECropUtility.setSessionData();
		
		List<ActiveSeason> cropYearActiveSeasonList = activeSeasonService.listAll();
		
		httpSession.setAttribute("ACTIVEYEAR", cropYearActiveSeasonList.get(0).getCropyear());
		httpSession.setAttribute("seasonActive", cropYearActiveSeasonList.get(0).getSeason());
		

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
            httpSession.setAttribute("dcode", userPrincipal.getDcode()); 
//            System.out.println("dcode------->"+userPrincipal.getDcode());
            httpSession.setAttribute("mcode",userPrincipal.getMandalCode()); 
            httpSession.setAttribute("wbdcode",userPrincipal.getwbDcode());
            httpSession.setAttribute("wbmcode", userPrincipal.getwbMcode()); 
            httpSession.setAttribute("name", userPrincipal.getUsername()); 
            httpSession.setAttribute("role", userPrincipal.getTypeUser()); 
           httpSession.setAttribute("wbvcode", userPrincipal.getwbvcode()); 
            httpSession.setAttribute("vscode", userPrincipal.getVillCode());
            httpSession.setAttribute("userid", userPrincipal.getUserid());
            
           System.out.println("userid--------->"+userPrincipal.getTypeUser());
            
         
    		httpSession.setAttribute("ACTIVEYEAR", cropYearActiveSeasonList.get(0).getCropyear());
    		httpSession.setAttribute("seasonActive", cropYearActiveSeasonList.get(0).getSeason());

            
          //  httpSession.setAttribute("ACTIVEYEAR", ECropUtility.getActiveYear());
            

            String user = userPrincipal.getUsername();
          //  villageSecRevEntity = villageSecRevRepository.getWbMasterDetailsForVillage(Integer.parseInt(userPrincipal.getvillCode()),userPrincipal.getwbMcode(),userPrincipal.getwbDcode());
            
            //UserRegEntity  entity=userRegRepo.findByUserid(userPrincipal.getUsername());
            String userType=userPrincipal.getTypeUser();
   
    		if (userType != null && "17".equalsIgnoreCase(userType)|| "55".equalsIgnoreCase(userType)) {
    			getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession);
    		
    		} else if (userType != null && ("5".equalsIgnoreCase(userType)||"22".equalsIgnoreCase(userType)||"2".equalsIgnoreCase(userType))) {
    			wbMaster = wbMasterService.getWbMasterDetailsForMandal(userPrincipal.getwbMcode(),
    					userPrincipal.getwbDcode());
    			if(wbMaster!=null) 
  			  { 
    				
    		  httpSession.setAttribute("wbedname",wbMaster.getWbedname()); 
    		  httpSession.setAttribute("wbemname",wbMaster.getWbemname()); 
    		  httpSession.setAttribute("wbevname",wbMaster.getWbevname()); 
    			getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), wbMaster.getWbedname(), wbMaster.getWbemname(), "",
    					httpSession);
  			  }

    		} 
    		else if("30".equalsIgnoreCase(userType)) {
    			wbMaster = wbMasterService.getWbMasterDetailsForVillage(userPrincipal.getwbvcode(),
    					userPrincipal.getwbMcode(), userPrincipal.getwbDcode());
//    					httpSession.setAttribute("wbedname",villageSecRevEntity.get(0).getWbedname()); 
//    		      		  httpSession.setAttribute("wbemname",villageSecRevEntity.get(0).getWbemname()); 
//    		      		  httpSession.setAttribute("wbevname",villageSecRevEntity.get(0).getWbvname());
    			
    		  httpSession.setAttribute("wbedname",wbMaster.getWbedname()); 
       		  httpSession.setAttribute("wbemname",wbMaster.getWbemname()); 
       		  httpSession.setAttribute("wbevname",wbMaster.getWbevname()); 
    			
    		      		 httpSession.setAttribute("wbvcode", userPrincipal.getwbvcode()); 
    		      		getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), wbMaster.getWbedname(), wbMaster.getWbemname(), wbMaster.getWbevname(),httpSession);

    			
    		}
    		
    		else if (userType != null &&( "25".equalsIgnoreCase(userType))) {
    			villageSecRevEntity = villageSecRevRepository.getWbMasterDetailsForVillage(Integer.parseInt(userPrincipal.getvillCode()),
    					userPrincipal.getwbMcode(), userPrincipal.getwbDcode());
    			
    				httpSession.setAttribute("wbedname",villageSecRevEntity.get(0).getWbedname()); 
      		  httpSession.setAttribute("wbemname",villageSecRevEntity.get(0).getWbemname()); 
      		  httpSession.setAttribute("wbevname",villageSecRevEntity.get(0).getWbvname());
    			getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), villageSecRevEntity.get(0).getWbedname(), villageSecRevEntity.get(0).getWbemname(),
    					villageSecRevEntity.get(0).getWbvname(), httpSession);

    		}
    		else if (userType != null && "18".equalsIgnoreCase(userType)) {
    			getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession);
    		} else if (userType != null && "46".equalsIgnoreCase(userType)) {
    			getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), "", "", "", httpSession);
    		}
    		else if (userType != null && "9".equalsIgnoreCase(userType) ) {
    			String distList= wbMasterService.findDCode(Integer.parseInt(userPrincipal.getDcode()));
    			 httpSession.setAttribute("wbdcode",userPrincipal.getwbDcode());
    			 httpSession.setAttribute("dcode", userPrincipal.getDcode()); 
    			 getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distList, "", "", httpSession);
    		}
    		else if (userType != null && "21".equalsIgnoreCase(userType)) {
    			 httpSession.setAttribute("dcode", userPrincipal.getDcode()); 
    				List<String> distList= wbMasterService.findDistByCode(userPrincipal.getwbDcode());
                	String distName=null;
            		if(distList.size()>0)
            		{
            		distName=distList.get(0);
            		}
    			 getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distName, "", "", httpSession);
    		}
             
            else if (userType != null && ("31".equalsIgnoreCase(userType)|| "19".equalsIgnoreCase(userType)||"44".equalsIgnoreCase(userType)||"45".equalsIgnoreCase(userType))) {
//            	httpSession.setAttribute("wbdcode", userPrincipal.getwbDcode());
//            	System.out.println("wbdcode------"+ userPrincipal.getwbDcode());
            	
//            	httpSession.setAttribute("wbdcodeJc",wbMasterService.findDCodeJc( userPrincipal.getUserid()));
//            	System.out.println("wbMasterService.findDCodeJc( userPrincipal.getUserid())---"+wbMasterService.findDCodeJc( userPrincipal.getUserid()));
            	List<String> distList= wbMasterService.findDistByCode(userPrincipal.getwbDcode());
            	String distName=null;
        		if(distList.size()>0)
        		{
        		distName=distList.get(0);
        		}
        		httpSession.setAttribute("wbdcode",userPrincipal.getwbDcode());
        		 httpSession.setAttribute("dcode", userPrincipal.getDcode()); 
        		 httpSession.setAttribute("mcode", userPrincipal.getMandalCode()); 
            	getHeaderMessage(userPrincipal.getName(), userPrincipal.getUsername(), distName, "", "", httpSession);
    		} 
	
    		return "home";
    		
	}

	@GetMapping("/login")
	public String loginPage(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request,HttpSession session) {
		
		
		String isCaptchaError = request.getParameter("captcha_error");
		String isLoginError = request.getParameter("error");
		if (Objects.nonNull(isLoginError) && "true".equalsIgnoreCase(isLoginError)) {
			model.addAttribute("msg", "Invalid Credentials");
		} else if (Objects.nonNull(isCaptchaError) && "true".equalsIgnoreCase(isCaptchaError)) {
			model.addAttribute("msg", "Invalid Captcha");
		}
		
		
		return "login";
		
		
	}
	
	@GetMapping("/home")
	public String home(@ModelAttribute AuthenticationRequest authenticationRequest, Model model,
			HttpServletRequest request,HttpSession session) {
		
		return "home";
	
	}
	

	public void getHeaderMessage(String name, String typeName, String district, String mandal, String village,
			HttpSession httpSession) {

		String headerMessage = String.format("Welcome to %s, %s, %s %s %s", name, typeName, getVillage(village),
				getMandal(mandal), getDistrict(district));
		httpSession.setAttribute("headerMessage", headerMessage);
	}

	public String getVillage(String village) {
		return village != null && !village.isEmpty() ? "RBK :: " + village + ", ": "";
	}

	public String getMandal(String mandal) {
		return mandal != null && !mandal.isEmpty() ? "Mandal :: " + mandal + ", ": "";
	}

	public String getDistrict(String district) {
		return district != null && !district.isEmpty() ? " District :: " + district: "";
	}
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session,HttpServletRequest request,HttpServletResponse response,Authentication authentication) {
	
	        String username = (String) session.getAttribute("name");
	        session.invalidate();
	
		   if (username != null) {
			  Cookie cookie = new Cookie("JSESSSIONID", null);
		     cookie.setMaxAge(0);
		     cookie.setSecure(true);
		     cookie.setHttpOnly(true);
		     
		     cookie.setPath("/");
       }
		   new SecurityContextLogoutHandler().logout(request, response, authentication);


	return "redirect:/login";
	}

} */