package com.eseed.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class RegularExpressionclassMethod {
    
    public boolean checkKhataNo(String digitsOnly) {
        return digitsOnly != null && digitsOnly.matches("[0-9]+") && !digitsOnly.isEmpty();
    }

    public boolean checkSuveyNo(String allowedCharacters) {
        return allowedCharacters != null &&
               allowedCharacters.matches("[a-zA-Z0-9|,-/\\u0C00-\\u0C7F]+") && 
               !allowedCharacters.isEmpty();
    }
    public boolean checkName(String name) {
        return name != null && name.matches("[a-zA-Z. ]+") && !name.isEmpty();
    }

    public boolean checkAadharNumber(String aadharNumber) {
        return aadharNumber != null && aadharNumber.matches("\\d{12}") && !aadharNumber.isEmpty();
    }

    public boolean checkMobileNumber(String mobileNumber) {
        return mobileNumber != null && mobileNumber.matches("[6-9]\\d{9}") && !mobileNumber.isEmpty();

    }

    public boolean checkExtent(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^(\\d{1,18}|\\d{1,18}\\.\\d{1,5})$") && !doubleValue.isEmpty();

    }
    
    public boolean villageCode(String doubleValue) {
        return doubleValue != null && doubleValue.matches( "^\\d{6,7}$") && !doubleValue.isEmpty();

    }

    public boolean mandalCode(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{2}(?:\\d{2})?$") && !doubleValue.isEmpty();

    }

    public boolean districtCode(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{1,3}$") && !doubleValue.isEmpty();

    }

    public boolean season(String doubleValue) {
        return doubleValue != null && doubleValue.matches( "^[kKRrSs]$") && !doubleValue.isEmpty();

    }
    
    public boolean year(String doubleValue) {
        return doubleValue != null && doubleValue.matches( "^\\d{4}$") && !doubleValue.isEmpty();

    }
    

    public boolean cropyearseason(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^[kKRrSs]@\\d{4}$") && !doubleValue.isEmpty();
    }
    

    public boolean wbdCode(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{1,2}$") && !doubleValue.isEmpty();

    }
    
    public boolean wbmcode(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{1,2}$") && !doubleValue.isEmpty();

    }
    public boolean cropCode(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{3}|\\d{5}$") && !doubleValue.isEmpty();

    }
   

    public boolean cropid(String input) {
        return input != null && input.matches("^\\d{5}$") && !input.isEmpty();
    }
    public boolean checkFirst_char(int a) {
        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
            return true;
        } else {
            return false;
        }
    }  
    public boolean checkstring(String a) {
        //System.out.println("a="+a);
       boolean flag = true;
       boolean charFlag = false;
       try {
           if ((a.trim()).equals("")) {
               return false;
           }
           int len = a.length();
           for (int i = 0; i < len; i++) {
               if (i == 0) {
                   if (checkFirst_char(((int) a.charAt(i)))) {
                       charFlag = true;
                   } else {
                       charFlag = false;
                       break;
                   }
               }
               if ((((int) a.charAt(i)) >= 65 && ((int) a.charAt(i)) <= 90) || ((int) a.charAt(i)) == 95 || ((int) a.charAt(i)) == 32 || ((int) a.charAt(i)) == 44 || (((int) a.charAt(i)) >= 97 && ((int) a.charAt(i)) <= 122) || (((int) a.charAt(i)) > 47 && ((int) a.charAt(i)) <= 57)) {
                   flag = true;                    
               } else {
                   return false;
               }
           }
           if (!charFlag) {
               return false;
           }
           if (a.equalsIgnoreCase("null")) {
               return false;
           }
           String[] str = {"alert", "select", "insert", "update", "delete", "SCRIPT", "script"};
           for (int j = 0; j < str.length; j++) {
               int index = (a.toLowerCase()).indexOf(str[j]);
               if (index != -1) {
                   return false;
               }
           }
       } catch (Exception e) {
           String err = e.toString();
           if (err.indexOf("NullPointerException") > 0) {
               flag = false;
           }
           if (err.indexOf("IOException ") > 0) {
               flag = false;
           }
           if (err.indexOf("NumberFormatException") > 0) {
               flag = false;
           }
       }
       return flag;
   }
    
    
    public boolean validateVerhoeff(String num) {
        int[][] d = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 0, 6, 7, 8, 9, 5},
            {2, 3, 4, 0, 1, 7, 8, 9, 5, 6},
            {3, 4, 0, 1, 2, 8, 9, 5, 6, 7},
            {4, 0, 1, 2, 3, 9, 5, 6, 7, 8},
            {5, 9, 8, 7, 6, 0, 4, 3, 2, 1},
            {6, 5, 9, 8, 7, 1, 0, 4, 3, 2},
            {7, 6, 5, 9, 8, 2, 1, 0, 4, 3},
            {8, 7, 6, 5, 9, 3, 2, 1, 0, 4},
            {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
        };

        int[][] p = {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 5, 7, 6, 2, 8, 3, 0, 9, 4},
            {5, 8, 0, 3, 7, 9, 6, 1, 4, 2},
            {8, 9, 1, 6, 0, 4, 3, 5, 2, 7},
            {9, 4, 5, 3, 1, 2, 6, 8, 7, 0},
            {4, 2, 8, 6, 5, 7, 3, 9, 0, 1},
            {2, 7, 9, 3, 8, 0, 6, 4, 1, 5},
            {7, 0, 4, 6, 9, 1, 3, 2, 5, 8}
        };

        int c = 0;
        int[] myArray = stringToReversedIntArray(num);
        for (int i = 0; i < myArray.length; i++) {
            c = d[c][p[i % 8][myArray[i]]];
        }

        return (c == 0);
    }

    private int[] stringToReversedIntArray(String num) {
        int[] myArray = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            myArray[i] = Character.getNumericValue(num.charAt(num.length() - i - 1));
        }
        return myArray;
    }

    public boolean cropGroup(String doubleValue) {
        return doubleValue != null && doubleValue.matches("^\\d{1}|\\d{2}$") && !doubleValue.isEmpty();

    }

    private static final String DATE_PATTERN = 
    		"^(?!0000)[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$";

    private static final Pattern pattern = Pattern.compile(DATE_PATTERN);

    public static boolean isValidDateFormat(String date) {
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    
//    public static void isValidDateFormat(String date) {
//        Matcher matcher = pattern.matcher(date);
//        System.out.println("------------->"+ matcher.matches());
//    }
//    
//    public static void main() {
//    	isValidDateFormat("2222-99-22");
//	}
    
}
