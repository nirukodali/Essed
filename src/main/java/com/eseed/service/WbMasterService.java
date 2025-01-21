package com.eseed.service;

import java.util.List;

import com.eseed.entity.WbMaster;

public interface WbMasterService {

	WbMaster getWbMasterDetailsForVillage(Integer village, Integer wbmcode, Integer wbdcode);

	WbMaster getWbMasterDetailsForMandal(Integer wbMcode, Integer wbDcode);
	
	List<WbMaster> findWebVcodeAndVname(Integer dcode, Integer mcode);
	
	List<WbMaster> findVillageName(Integer dcode, Integer mcode, Integer vcode);
	
	List<WbMaster> findUnsurveyedVilageList(Integer dcode, Integer mcode);

	List<String> findDistByCode(Integer dcode);

	String findDCode(int dcode);

	String findDCodeJc(String userid);


}
