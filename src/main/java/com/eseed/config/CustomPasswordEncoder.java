package com.eseed.config;


import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//@Service
@Component
public class CustomPasswordEncoder implements PasswordEncoder{

	@Override
	public String encode(CharSequence rawPassword) {
//		String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
		
	//	return DigestUtils.sha256Hex(DigestUtils.sha256Hex(rawPassword.toString().getBytes()));
	
		//System.out.println("rawpaswword------------------------->"+ DigestUtils.sha256Hex((rawPassword.toString().getBytes())));
		
		
		
		return DigestUtils.sha256Hex((rawPassword.toString().getBytes()));

		
		
		//return DigestUtils.md5Hex(DigestUtils.md5Hex(rawPassword.toString().getBytes()).getBytes());
	//	return rawPassword.toString();
//		return Sha512DigestUtils.shaHex(rawPassword.toString().getBytes());
	}

	 @Override
	    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//		 System.out.println("89866456564546564546546546");
//		 System.out.println("rawPassword >>>>"+encodedPassword);
//	        String rawEncoded = encode(rawPassword);
	        String encodedPassword1 = encode(encodedPassword);

	        
	     //   System.out.println("encoded by password------------------>"+rawEncoded);
//	        
	    //    return Objects.equals(rawPassword.toString().split("_")[1], encodedPassword.toString());
	       
//			String encpassword = authenticationRequest.getPassword();
	        
//		 System.out.println("both are equal------------->"+Objects.equals(rawPassword, encodedPassword1.toString()));
		 return Objects.equals(rawPassword.toString(), encodedPassword1.toString());
	        
	    }
	 
}