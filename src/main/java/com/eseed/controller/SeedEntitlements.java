package com.eseed.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eseed.dto.AddSeedVarietyDto;
import com.eseed.dto.Districtdto;
import com.eseed.dto.ProductPriceDto;
import com.eseed.dto.ProductPricesBDto;
import com.eseed.dto.StandardsQtyDto;
import com.eseed.repo.AddSeedVarietyRepo;

@Controller
public class SeedEntitlements {

	@Autowired
	AddSeedVarietyRepo addSeedVarietyRepo;

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/updateSeedEntitlements")
	public String addSeedVarietyproduct(Model model) {
		List<Districtdto> district = addSeedVarietyRepo.getDistrict();
		model.addAttribute("district", district);

		List<AddSeedVarietyDto> seedGroup = addSeedVarietyRepo.getseedGroup();
		model.addAttribute("seedGroup", seedGroup);

		return "adaroles/updateSeedEntitlements";
	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/getSeedVarieties")
	@ResponseBody
	public List<AddSeedVarietyDto> getSeedVarieties(@RequestParam("groupcode") Integer groupcode,
			@RequestParam("dcode") Integer dcode) {
		return addSeedVarietyRepo.getseedVariety(groupcode, dcode);
	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@PostMapping("/submitSeedEntitlement")
	public String processSeedEntitlementForm(@RequestParam("dcode") String dcode, @RequestParam("svcode") String svcode,
			Model model) {
		System.out.println("dcode" + dcode + "vcode" + svcode);
		List<ProductPricesBDto> productPrices = addSeedVarietyRepo.getProductPrices(Integer.parseInt(dcode), svcode);
		model.addAttribute("productPrices", productPrices);

		List<Districtdto> district = addSeedVarietyRepo.getDistrict();
		model.addAttribute("district", district);

		List<AddSeedVarietyDto> seedGroup = addSeedVarietyRepo.getseedGroup();
		model.addAttribute("seedGroup", seedGroup);
		return "adaroles/updateSeedEntitlements";
	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@RequestMapping("/edit")
	public String editSeedEntitlement(@RequestParam("varietycode") String varietycode,
			@RequestParam("cropyear") Integer cropyear, @RequestParam("season") String season,
			@RequestParam("dcode") Integer dcode, Model model) {
		String enabledelete = "Y";

		List<ProductPricesBDto> productPrice = addSeedVarietyRepo.getProductPriceByDetails(varietycode, cropyear,
				season, dcode);
		model.addAttribute("productPrice", productPrice);
		System.out.println(productPrice.toString());

		int Transaction = addSeedVarietyRepo.getTransactionDetails(varietycode, cropyear, season, dcode);
		if (Transaction > 0) {
			enabledelete = "N";
		}
		model.addAttribute("enabledelete", enabledelete);

		List<StandardsQtyDto> standardsQtyList = addSeedVarietyRepo.getStandardsQtyList(varietycode, cropyear, season,
				dcode);
		model.addAttribute("standardsQtyList", standardsQtyList);
		System.out.println(standardsQtyList.toString());

		return "adaroles/seedEntitlements2";
	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@GetMapping("/delete")
	public @ResponseBody String deleteSeedEntitlement(@RequestParam("stdid") Integer stdid,
			@RequestParam("varietycode") String varietycode, @RequestParam("cropyear") Integer cropyear,
			@RequestParam("season") String season, @RequestParam("dcode") Integer dcode,
			@RequestHeader(value = "X-Requested-With", required = false) String requestedWith, Model model) {

		try {
			int deleteid = addSeedVarietyRepo.deletePriceByDetails(stdid);

			String enabledelete = "Y";
			List<ProductPricesBDto> productPrice = addSeedVarietyRepo.getProductPriceByDetails(varietycode, cropyear,
					season, dcode);
			int Transaction = addSeedVarietyRepo.getTransactionDetails(varietycode, cropyear, season, dcode);
			if (Transaction > 0) {
				enabledelete = "N";
			}
			List<StandardsQtyDto> standardsQtyList = addSeedVarietyRepo.getStandardsQtyList(varietycode, cropyear,
					season, dcode);
			if ("XMLHttpRequest".equals(requestedWith)) {
				return "success";
			} else {
				model.addAttribute("productPrice", productPrice);
				model.addAttribute("enabledelete", enabledelete);
				model.addAttribute("standardsQtyList", standardsQtyList);
				return "adaroles/seedEntitlements2";
			}
		} catch (Exception e) {
			if ("XMLHttpRequest".equals(requestedWith)) {
				return "Error deleting entitlement data";
			}
			model.addAttribute("error", "Error deleting entitlement data ");
			return "adaroles/updateSeedEntitlements";
		}
	}

	@PreAuthorize("hasAuthority('17') || hasAuthority('11')")
	@PostMapping("/updateEntitlement")
	public String updateSeedEntitlement(@RequestParam("varietycode") String varietycode,
			@RequestParam("quantityperbag") String quantityperbag,
			@RequestParam("fromdate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromdate,
			@RequestParam("todate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date todate,
			@RequestParam("season") Character season, @RequestParam("cropyear") Integer cropyear,
			@RequestParam("dcode") Integer dcode, @RequestParam("from_extent[]") List<Double> fromExtent,
			@RequestParam("to_extent[]") List<Double> toExtent,
			@RequestParam("no_bags_allowed[]") List<Integer> noBagsAllowed, @RequestParam("season") String season1,
			Model model, RedirectAttributes redirectAttributes) {

		try {
			int rowsInserted = addSeedVarietyRepo.insertSeedEntitlement(varietycode, quantityperbag, fromdate, todate,
					season, cropyear, dcode, fromExtent, toExtent, noBagsAllowed);

			String enabledelete = "Y";

			List<ProductPricesBDto> productPrice = addSeedVarietyRepo.getProductPriceByDetails(varietycode, cropyear,
					season1, dcode);
			model.addAttribute("productPrice", productPrice);

			int Transaction = addSeedVarietyRepo.getTransactionDetails(varietycode, cropyear, season1, dcode);
			if (Transaction > 0) {
				enabledelete = "N";
			}
			model.addAttribute("enabledelete", enabledelete);

			List<StandardsQtyDto> standardsQtyList = addSeedVarietyRepo.getStandardsQtyList(varietycode, cropyear,
					season1, dcode);
			model.addAttribute("standardsQtyList", standardsQtyList);

			if (rowsInserted > 0) {
				redirectAttributes.addFlashAttribute("successMessage", "Insertion successful");
			} else {
				redirectAttributes.addFlashAttribute("error", "Insertion failed");
			}

			return "redirect:/edit?varietycode=" + varietycode + "&cropyear=" + cropyear + "&season=" + season1
					+ "&dcode=" + dcode;

		} catch (Exception e) {
			redirectAttributes.addFlashAttribute("error", "Error inserting entitlement data");
			return "redirect:/updateSeedEntitlements";
		}
	}

}
