package com.eseed.captcha;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.eseed.entity.AppUser;

@Component
public class CaptchaGenerator{ // implements InitializingBean

	 
	private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 10;

    public CaptchaDetails generateCaptcha() {
        Random random = new Random();
        int operand1 = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int operand2 = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;

        int answer=0;
        String operationType = "";
    //   int operation = random.nextInt(4); // Generate a random number between 0 and 3
   int operation=0;
        switch (operation) {
            case 0:
                answer = operand1 + operand2;
                operationType = "Addition";
                break;
//            case 1:
//                answer = operand1 - operand2;
//                operationType = "Subtraction";
//                break;
//            case 2:
//                answer = operand1 * operand2;
//                operationType = "Multiplication";
//                break;
//            case 3:
//                answer = operand1 / operand2;
//                operationType = "Division";
//                break;
        }

      //  String question = "What is the result of "+operand1 + " " + getOperationSymbol(operation) + " " + operand2 + " = ?";
        String question = " "+operand1 + " " + getOperationSymbol(operation) + " " + operand2 + " = ?";
        return new CaptchaDetails(answer,question, operationType);
    }

    private String getOperationSymbol(int operation) {
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            case 3:
                return "/";
            default:
               return "+";
        }
    }

    public boolean verifyCaptcha(int userAnswer, AppUser captcha) {
        return userAnswer == captcha.getAnswer();
    }
	
}
