package com.company.MockInterviews.AMockInterviews.Mock01102020;

// https://leetcode.com/problems/longest-palindromic-substring/
public class Problem1 {
    private String result = "";

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0) return "";
        int[][] memo = new int[length][length];
        traverse(0, length - 1, s, memo);
        return result;
    }

    private void traverse(int left, int right, String s, int[][] memo) {
        if (left > right || memo[left][right] == 1) {
            return;
        }

        if (isPalindrome(s, left, right)) {
            String substr = s.substring(left, right + 1);
            if (result.length() < substr.length()) {
                result = substr;
            }
        } else {
            traverse(left, right - 1, s, memo);
            traverse(left + 1, right, s, memo);
        }

        memo[left][right] = 1;
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else return false;
        }
        return true;
    }
}
