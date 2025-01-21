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

import com.eseed.dto.StandardsQty;
import com.eseed.entity.IndentEntity;
import com.eseed.entity.ReplicationEntity;
import com.eseed.repo.IndentEntryRepo;
import com.eseed.repo.replicationrepo;

@Controller
public class Replicationseed {

	@Autowired
	IndentEntryRepo repo;

	@Autowired
	private replicationrepo reprepo;

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/replication")
	public String ReplicationEntry(Model model) {
		List<IndentEntity> list = repo.getAllDistrict();
		model.addAttribute("district", list);
		return "adaroles/replication";

	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@PostMapping("/replicationdata")
	public String Replication(Model model, HttpServletRequest request, HttpSession httpSession) {
		int dcode = Integer.parseInt(request.getParameter("district").toString());
		model.addAttribute("dcode", request.getParameter("dcode"));
		System.out.println("dcode-------------" + dcode);

		List<ReplicationEntity> list = reprepo.Replicationseed(dcode);
		model.addAttribute("list", list);

		List<IndentEntity> list2 = repo.getAllDistrict();
		model.addAttribute("district", list2);
		return "adaroles/replication";
	}

	@GetMapping("getStandardsQtyData")
	public String replicationSeed(@RequestParam Integer dcode, @RequestParam String varietycode,
			@RequestParam Character season, @RequestParam Integer cropyear, Model model) {

		List<StandardsQty> standardsQtyList = reprepo.getStandardsQtyData(dcode, varietycode, season, cropyear);
		List<StandardsQty> getDistrictsData = reprepo.getDistrictsData(dcode, varietycode, season, cropyear);
		model.addAttribute("standardsQtyList", standardsQtyList);
		model.addAttribute("getDistrictsData", getDistrictsData);
		return "adaroles/replicationseed";
	}

	@PostMapping("/insertData")
	public String insertData(Model model, @RequestParam List<Integer> selectedDcodes, @RequestParam String varietycode,
			@RequestParam Integer cropyear, @RequestParam String season, @RequestParam Integer repdcode,
			RedirectAttributes redirectAttributes, HttpSession httpSession, HttpServletRequest request) {
		System.out.println(selectedDcodes + varietycode + cropyear + season + repdcode);

		String status = "Replicated Standards from " + repdcode + " To " + selectedDcodes + " for " + varietycode + " "
				+ cropyear + season;
		String user = (String) httpSession.getAttribute("userid");
		String role = (String) httpSession.getAttribute("role");
		String ipAddress = request.getRemoteAddr();
		System.out.println(status);

		int insertion = reprepo.insertStandardsQty(selectedDcodes, varietycode, cropyear, season, repdcode);
		System.out.println("selectedDcodes: " + selectedDcodes);
		System.out.println("varietycode: " + varietycode);
		System.out.println("cropyear: " + cropyear);
		System.out.println("season: " + season);
		System.out.println("repdcode: " + repdcode);
		if (insertion > 0) {
			redirectAttributes.addFlashAttribute("successMessage", "Insertion successful");
		} else {
			redirectAttributes.addFlashAttribute("error", "Insertion failed");
		}

		int repStand = reprepo.replicatedStandards(user, selectedDcodes, status, ipAddress, role);

		List<IndentEntity> list = repo.getAllDistrict();
		model.addAttribute("district", list);
		return "redirect:/replication";
	}
}
