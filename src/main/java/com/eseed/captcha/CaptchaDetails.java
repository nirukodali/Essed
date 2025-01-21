package com.eseed.captcha;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.util.WebUtils;


public class CaptchaDetails implements Serializable{


	//private static final long serialVersionUID = -4223263143656317128L;


	private  int answer;
	private  String captcha;
	private  String	operationType;

	public CaptchaDetails(HttpServletRequest request) {
		this.answer =Integer.parseInt( request.getParameter("captcha"));
		//this.captcha = (Captcha) WebUtils.getSessionAttribute(request, "captcha");
		this.captcha = (String) WebUtils.getSessionAttribute(request, "captcha");
		this.operationType= request.getParameter("operationType");
	}
	
	


	
	public CaptchaDetails() {
		super();
		
	}


	public CaptchaDetails(int answer, String captcha, String operationType) {
		super();
		this.answer = answer;
		this.captcha = captcha;
		this.operationType = operationType;
	}










	public int getAnswer() {
		return answer;
	}








	public String getCaptcha() {
		return captcha;
	}








	public String getOperationType() {
		return operationType;
	}








	@Override
	public String toString() {
		return "CaptchaDetails [answer=" + answer + ", captcha=" + captcha + ", operationType=" + operationType + "]";
	}
	
	
	
	
}
