package com.company.ValidPalindrome125;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char left = Character.toLowerCase(chars[i]);
            char right = Character.toLowerCase(chars[j]);

            if(!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }

            if (left != right) return false;
            i++;
            j--;
        }

        return true;
    }
}
