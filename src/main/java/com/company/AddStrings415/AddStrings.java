package com.company.AddStrings415;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int num1Length = num1.length();
        int num2Length = num2.length();
        int maxLength = num1Length > num2Length ? num1Length : num2Length;
        StringBuilder result = new StringBuilder();

        int decimal = 0;
        for (int i = 0; i < maxLength; i++) {
            String num1Char;
            String num2Char;
            int num1Index = num1Length - 1 - i;
            int num2Index = num2Length - 1 - i;

            num1Char = num1Index >= 0 ?
                    num1.substring(num1Index, num1Index + 1) :
                    "0";
            num2Char = num2Index >= 0 ?
                    num2.substring(num2Index, num2Index + 1) :
                    "0";

            int res = Integer.parseInt(num1Char) + Integer.valueOf(num2Char) + decimal;
            decimal = 0;
            if (res >= 10) {
                decimal = 1;
                res = res - 10;
            }
            result.insert(0, res);
            if (i == maxLength - 1 && decimal == 1) result.insert(0, "1");
        }

        return result.toString();
    }
}
