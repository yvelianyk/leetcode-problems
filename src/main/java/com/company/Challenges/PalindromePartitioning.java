package com.company.Challenges;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    List<List<String>> result;
    int memo[][];
    public List<List<String>> partition(String s) {
        int n = s.length();
        memo = new int[n + 1][n + 1];
        result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>());
        return result;
    }

    private void backtrack(int index, String s, List<String> currentList) {
        if(index >= s.length()) result.add(new ArrayList<>(currentList));
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i + 1)) {
                currentList.add(s.substring(index, i + 1));
                backtrack(i + 1, s, currentList);
                currentList.remove(currentList.size() - 1);
            }
        }
    }


    private boolean isPalindrome(String s, int start, int end) {
        if(memo[start][end] != 0) return memo[start][end] == 1;
        String palindrome = s.substring(start, end);
        int left = 0;
        int right = palindrome.length() - 1;
        while (left < right) {
            if (palindrome.charAt(left++) != palindrome.charAt(right--)) {
                return false;
            }
        }
        memo[start][end] = 1;
        return true;
    }
}
