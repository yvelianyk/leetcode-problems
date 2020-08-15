package com.company;

import com.company.AugustLeetcodeChallenge.LongestPalindrome;
import com.company.AugustLeetcodeChallenge.NonOverlappingIntervals;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LongestPalindrome solution = new LongestPalindrome();
        int result = solution.longestPalindrome("ababababa");
        System.out.println(result);
    }
}
