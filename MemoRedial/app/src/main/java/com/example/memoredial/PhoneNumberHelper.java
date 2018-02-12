package com.example.memoredial;

/**
 * Created by jrcb7 on 2/6/2018.
 */

public class PhoneNumberHelper {
    private String number = "";

    public String addNumber(int num) {
        return addNumber(Integer.toString(num));
    }
    public String addNumber(String num) {
        if (number.length() < 11) {
            number += num;
        }
        return number.toString();
    }
    public String back() {
        number = number.substring(0,number.length()-1);
        return number;
    }

    public String toString() {
        int len = number.length();
        String result = "";
        switch (len) {
            case 1:
            case 2:
            case 3:
            case 4:
                result = number;
                break; // just putting these breaks here as a formality
            case 5:
                result = number.charAt(0) + "-" + number.substring(1);
                break; // just putting these breaks here as a formality
            case 6:
                result = number.substring(0,1) + "-" + number.substring(2);
                break; // just putting these breaks here as a formality
            case 7:
                result = number.substring(0,2) + "-" + number.substring(3);
                break;
            case 8:
                result = "(  " + number.charAt(0) + ")" + number.substring(1,3) + "-" +number.substring(4);
                break;
            case 9:
                result = "( " + number.substring(0,1)+")" + number.substring(2,4) + "-" + number.substring(5);
                break;
            case 10:
                result = "(" + number.substring(0,2) + ")" + number.substring(3,5) + "-" + number.substring(6);
                break;
        }
        return result;
    }

}
