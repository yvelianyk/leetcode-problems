package com.company.ValidPalindromeII680;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return (isValidInRange(s, i, j-1) || isValidInRange(s, i + 1, j));
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isValidInRange(String s, int start, int end) {
        char[] chars = s.toCharArray();
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
