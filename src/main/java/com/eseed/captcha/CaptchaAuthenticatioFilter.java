package com.eseed.captcha;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.ui.Model;

public class CaptchaAuthenticatioFilter extends AbstractAuthenticationProcessingFilter {
	private String processUrl;
	
	 public CaptchaAuthenticatioFilter(String defaultFilterProcessesUrl, String failureUrl) {
	        super(defaultFilterProcessesUrl);
	        this.processUrl = defaultFilterProcessesUrl;
	        setAuthenticationFailureHandler(new SimpleUrlAuthenticationFailureHandler(failureUrl));
	    }
	

   

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse)response;
        if(processUrl.equals(req.getServletPath()) && "POST".equalsIgnoreCase(req.getMethod())){
            String expect = req.getSession().getAttribute("answer").toString();
           // System.out.println("expect is--->"+expect);
            //System.out.println("answer is--->"+req.getParameter("answer"));

            //remove from session
            req.getSession().removeAttribute("answer");

            if (expect != null && !expect.equals(req.getParameter("answer"))){
                unsuccessfulAuthentication(req, res, new InsufficientAuthenticationException("Wrong verification code."));
                return;
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        return null;
    }
}
