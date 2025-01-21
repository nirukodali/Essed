package com.eseed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.eseed.repo.User_registrationRepository;
import com.eseed.service.User_registrationService;

@Service
public class User_registrationServiceImpl implements User_registrationService {
	
	@Autowired 
	User_registrationRepository  user_registrationRepository;

	public String findAll(String username){
		return user_registrationRepository.getUserId(username);
	}

}
