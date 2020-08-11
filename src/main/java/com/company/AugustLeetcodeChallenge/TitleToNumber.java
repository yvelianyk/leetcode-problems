package com.company.AugustLeetcodeChallenge;

public class TitleToNumber {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;
        int counter = 0;

        for (int i = length - 1; i >= 0; i--)
            result += (chars[i] - 'A' + 1) * Math.pow(26, counter++);

        return result;
    }
}
