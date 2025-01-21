package com.eseed.service;

import org.springframework.stereotype.Service;

//@Service
public interface LastLoginService {

	public String getLastLogin(String userid);
	
	public boolean updateLastLogin(String userid);
}
