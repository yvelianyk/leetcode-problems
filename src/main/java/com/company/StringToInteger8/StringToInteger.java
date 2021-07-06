package com.company.StringToInteger8;

public class StringToInteger {
    public int myAtoi(String str) {
        String trimmedStr = str.trim();
        if (trimmedStr.length() == 0) return 0;

        if (trimmedStr.charAt(0) == '-') {
            int res = getInt(trimmedStr.substring(1), true);
            return res * -1;
        } else if (trimmedStr.charAt(0) == '+') {
            return getInt(trimmedStr.substring(1), false);
        } else if (!Character.isDigit(trimmedStr.charAt(0))) {
            return 0;
        } else {
            return getInt(trimmedStr, false);
        }
    }

    private int getInt(String string, boolean isNegative) {
        long digit;
        long num = 0;
        for (int i = 0; i < string.length(); i++) {
            char currChar = string.charAt(i);
            boolean isDigit = Character.isDigit(currChar);
            if (!isDigit) break;

            digit = currChar - '0';
            num = num * 10;
            num = num + digit;
            if (isNegative) {
                if (Integer.MIN_VALUE >= num * -1) return Integer.MIN_VALUE;
            } else {
                if (Integer.MAX_VALUE <= num) return Integer.MAX_VALUE;
            }
        }

        return (int) num;
    }
}
