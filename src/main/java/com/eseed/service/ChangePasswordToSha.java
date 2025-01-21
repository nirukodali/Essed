package com.eseed.service;

import org.apache.commons.codec.digest.DigestUtils;

import org.springframework.stereotype.Service;

@Service
public class ChangePasswordToSha {
	
	
	
	public String encode(CharSequence rawPassword) {
//		String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
		
	//	return DigestUtils.sha256Hex(DigestUtils.sha256Hex(rawPassword.toString().getBytes()));
	
		//System.out.println("rawpaswword------------------------->"+ DigestUtils.sha256Hex((rawPassword.toString().getBytes())));
		
		
		
		// return DigestUtils.sha256Hex((rawPassword.toString().getBytes()));

		
		
		return DigestUtils.md5Hex(DigestUtils.md5Hex(rawPassword.toString().getBytes()).getBytes());

}
}