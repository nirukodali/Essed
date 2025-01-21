package com.eseed.service.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eseed.service.WbMasterService;
import com.eseed.entity.WbMaster;
import com.eseed.repo.WbMasterRepo;

@Service
public class WbMasterServiceImpl implements WbMasterService {

	@Autowired
	WbMasterRepo wbMasterRepo;

	@Override
	public WbMaster getWbMasterDetailsForVillage(Integer village, Integer wbMcode, Integer wbDcode) {
		return wbMasterRepo.getWbMasterDetailsForVillage(village, wbMcode, wbDcode);
	}

	@Override
	public WbMaster getWbMasterDetailsForMandal(Integer wbMcode, Integer wbDcode) {
		return wbMasterRepo.getWbMasterDetailsForMandal(wbMcode, wbDcode);
	}
		@Override
		public List<WbMaster> findWebVcodeAndVname(Integer dcode, Integer mcode) {
			return wbMasterRepo.findWebVcodeAndVname(dcode,  mcode);
		}
		
		@Override
		public List<WbMaster> findVillageName(Integer dcode, Integer mcode, Integer vcode){
			return wbMasterRepo.findVillageName( dcode,  mcode,  vcode);
	}
		
		
		@Override
		public List<WbMaster> findUnsurveyedVilageList(Integer dcode, Integer mcode) {
			return wbMasterRepo.findUnsurveyedVilageList(dcode, mcode);
		}
		
		@Override
		public List<String> findDistByCode(Integer dcode) {
			return wbMasterRepo.findDistByCode(dcode);
		}

		@Override
		public String findDCode(int dcode) {
			// TODO Auto-generated method stub
			return wbMasterRepo.findDCode(dcode);
		}
		
		@Override
		public String findDCodeJc(String userid) {
			// TODO Auto-generated method stub
			return wbMasterRepo.findDCodeJc(userid);
		}


}
