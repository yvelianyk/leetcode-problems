package com.company.GreatestCommonDivisorofStrings1071;

public class GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() == 0) return str2;
        if (str2.length() == 0) return str1;
        if (str1.length() > str2.length()) {
            return str1.startsWith(str2) ? gcdOfStrings(str1.substring(str2.length()), str2) : "";
        } else {
            return str2.startsWith(str1) ? gcdOfStrings(str2.substring(str1.length()), str1) : "";
        }
    }
}
