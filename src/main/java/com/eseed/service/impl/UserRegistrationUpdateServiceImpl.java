package com.eseed.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.eseed.repo.UserRegistrationUpdate;
import com.eseed.service.UserRegistrationUpdateService;

@Service
public class UserRegistrationUpdateServiceImpl implements UserRegistrationUpdateService {
	
	@Autowired
	UserRegistrationUpdate userRegistrationUpdate;

	public int findAll(String newpassword, String username, String dcode) {
		 return userRegistrationUpdate.updateUserReg(newpassword,username,dcode);
	}

	public int insertTracer(String userid, String username, String dcode) {
		return userRegistrationUpdate.insertTracer(userid,username,dcode);
	}


}
