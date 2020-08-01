package com.company.AugustLeetcodeChallenge;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        boolean allCapital = true;
        boolean allNotCapital = true;
        boolean onlyFirstCapital = true;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (i == 0 && Character.isLowerCase(aChar))
                onlyFirstCapital = false;
            if (i != 0 && Character.isUpperCase(aChar))
                onlyFirstCapital = false;
            if (Character.isUpperCase(aChar)) allNotCapital = false;

            if (Character.isLowerCase(aChar)) allCapital = false;
        }
        return allCapital || allNotCapital || onlyFirstCapital;
    }
}
