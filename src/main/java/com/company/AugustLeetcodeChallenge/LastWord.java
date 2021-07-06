package com.company.AugustLeetcodeChallenge;

public class LastWord {
    //String[] arrOfStr = s.split("\\s");
    public int lengthOfLastWord(String s) {
        String[] arrOfStr = s.split("\\s");
        if (arrOfStr.length == 0) return 0;
        return arrOfStr[arrOfStr.length - 1].length();
    }
}
