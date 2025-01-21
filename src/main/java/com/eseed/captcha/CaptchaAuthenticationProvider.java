package com.eseed.captcha;

import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class CaptchaAuthenticationProvider extends DaoAuthenticationProvider  {
	
	
	
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
		super.additionalAuthenticationChecks(userDetails, authentication);
		
		Object object = authentication.getDetails();
		if(!(object instanceof CaptchaDetails)) {
			throw new InsufficientAuthenticationException("Captcha Details Not Found.");
		}
		
		CaptchaDetails captchaDetails = (CaptchaDetails) object;
		String captcha = captchaDetails.getCaptcha();
		if(captcha != null) {
			if(!captcha.equals(captchaDetails.getAnswer())) {
				throw new InsufficientAuthenticationException("Captcha does not match.");
			}
		}
	}

}
