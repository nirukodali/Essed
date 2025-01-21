package com.eseed.util;

import java.util.StringTokenizer;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonMethods {
	
	 public static String ReverseDateString(String date) {
	        String result = "";
	        //System.out.println("------------------"+date);
	        if ((date != null) && (date.length() == 10)) {
	            String st[] = new String[3];
	            int i = 0;
	            StringTokenizer st1 = new StringTokenizer(date, "-");
	            while (st1.hasMoreTokens()) {
	                st[i++] = st1.nextToken();
	            }

	            result = st[2] + "-" + st[1] + "-" + st[0];
	        }
	        return result;
	    }

	
}
