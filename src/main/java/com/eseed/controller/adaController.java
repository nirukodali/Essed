package com.eseed.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eseed.entity.Authenticationabstract;
import com.eseed.entity.Pricesreport;
import com.eseed.partition.AuthenticationAbstract2Partition;
import com.eseed.partition.PricesreportPartition;
import com.eseed.projection.DistrictProjections;
import com.eseed.repo.DistrictRepository;

@Controller
public class adaController {
	@Autowired 
	private DistrictRepository distrepo;
	
	@GetMapping("/distmandal")
	public String getdistmandal(HttpSession httpSession, Model model) {
//		System.out.println("/vaa");

		String dcode = (String) httpSession.getAttribute("dcode");
//		System.out.println("dcode" + dcode);

		List<DistrictProjections> dist = distrepo.getList();
//		System.out.println("dist" + dist.size());

		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);

		return "adaroles/DistMand";
	}
	
	
	@GetMapping("/vsdistrict")
	public String getvsdistrict(HttpSession httpSession) {

		return "adaroles/Vsdistricttarget";
	}
	
	
	@GetMapping("/userreg")
	public String getFarmerDetails(HttpSession httpSession, Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");
//		System.out.println("dcode" + dcode);

		List<DistrictProjections> dist = distrepo.getList();
//		System.out.println("dist" + dist.size());

		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);

		return "adaroles/Userregdetails";
	}
	
	
	@GetMapping("/subproduct")
	public String getsubproduct(HttpSession httpSession) {

		return "adaroles/subproductvariety";
	}
	
	
	@GetMapping("/seednames")
	public String getseednames(HttpSession httpSession) {

		return "adaroles/Seednames";
	}
	
	
	@GetMapping("/prices")
	public String getprices(HttpSession httpSession,Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");

		List<DistrictProjections> dist = distrepo.getList();
//		System.out.println("dist" + dist.size());

		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);
		return "adaroles/Prices";
	}
	@GetMapping("/aadharcnt")
	public String getAadharCount(HttpSession httpSession) {

		return "adaroles/Rep_Aadhaar_CntIntf";
	}
	
	@GetMapping("/AuthenticatedFarmerlist")
	public String getAauthFarmList(HttpSession httpSession,Model model) {
		String dcode = (String) httpSession.getAttribute("dcode");
//		System.out.println("dcode" + dcode);

		List<DistrictProjections> dist = distrepo.getList();
//		System.out.println("dist" + dist.size());

		model.addAttribute("dcode", dcode);
		model.addAttribute("dist", dist);
		return "adaroles/OfficerAuthenticatedFarmeList";
	}
	
	@GetMapping("/authentication")
	public String getauthentication(HttpSession httpSession) {

		return "adaroles/Authentication";
	}
	
		//==========================AuthenticationAbstract2=============================
				@Autowired
				private AuthenticationAbstract2Partition authenticationAbstract2Partition;
				
				@GetMapping("/getAuthAbs2")
				public String getdisttabmand(Model model,@RequestParam String cropyear,@RequestParam String dcode,@RequestParam String status,
						@RequestParam String season) {
						
					List<Authenticationabstract> list = authenticationAbstract2Partition.getAuthAbs2(cropyear, dcode,status,season);
					model.addAttribute("list", list);
					model.addAttribute("cropyear", cropyear);
					model.addAttribute("season", season);
//					list.stream().forEach(a->System.out.println(a));

					return "adaroles/AuthenticationAbstract2";
				}	
			
						//==========================AuthenticationAbstract3=============================
						
						
						@GetMapping("/getAuthAbs3")
						public String getOfficerAuth(Model model,@RequestParam String cropyear,@RequestParam String mcode,@RequestParam String status,
								@RequestParam String season) {
								
							List<Authenticationabstract> list = authenticationAbstract2Partition.getAuthAbs3(cropyear, mcode,status,season);
							model.addAttribute("list", list);
							model.addAttribute("cropyear", cropyear);
//							model.addAttribute("season", season);
//							list.stream().forEach(a->System.out.println(a));

							return "adaroles/AuthenticationAbstract3";
						}	
						
		
						@GetMapping("/otp")
						public String getotp(HttpSession httpSession,Model model) {
							String dcode = (String) httpSession.getAttribute("dcode");

							List<DistrictProjections> dist = distrepo.getList();
//							System.out.println("dist" + dist.size());

							model.addAttribute("dcode", dcode);
							model.addAttribute("dist", dist);
							return "adaroles/otptrans";
						}
						
						
						
						@GetMapping("/stateindent")
						public String getstateindent(HttpSession httpSession) {

							return "adaroles/Statewiseindent";
						}
						
						@GetMapping("/benf")
						public String getbenf(HttpSession httpSession,Model model) {
							String dcode = (String) httpSession.getAttribute("dcode");

							List<DistrictProjections> dist = distrepo.getList();
//							System.out.println("dist" + dist.size());

							model.addAttribute("dcode", dcode);
							model.addAttribute("dist", dist);
							return "adaroles/Benfcomag";
						}
						
	//==========================================ben========================================================//					
						@GetMapping("/extenter")
						public String getextenter(HttpSession httpSession) {

							return "adaroles/Extentered";
						}
						
						@GetMapping("/getStartDate")
						@ResponseBody
						public List<Date> getStartDate(@RequestParam("cropyear") String cropyear, @RequestParam("season") String season) {
							System.out.println("---------");
							
							System.out.println("season==>"+season);
							
							List<Date> fdate=distrepo.getStartDt(cropyear, season);
							
							System.out.println("fdate===>"+fdate.toString());
							return fdate ;
						}	
						

}
