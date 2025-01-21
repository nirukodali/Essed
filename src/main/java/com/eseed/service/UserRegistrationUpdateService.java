package com.eseed.service;

public interface UserRegistrationUpdateService {
	public int findAll(String newpassword, String username, String dcode);
	public int insertTracer(String userid, String username, String dcode);

}
