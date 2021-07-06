package com.company.Contest18;

public class Problem2 {
    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) == 'a'
                    && i != palindrome.length() - 1) continue;
            char temp = sb.charAt(i);
            for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                sb.setCharAt(i, alphabet);
                if (!isPalindrome(new String(sb))) {
                    return new String(sb);
                }
            }
            sb.setCharAt(i, temp);
        }

        return "";
    }

    private boolean isPalindrome(String palindrome) {
        int left = 0;
        int right = palindrome.length() - 1;
        while (left < right) {
            if (palindrome.charAt(left++) != palindrome.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
