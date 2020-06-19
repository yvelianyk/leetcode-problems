package com.company;

import com.company.JuneLeetcodeChallenge.LongestDuplicatedSubstring;
import com.company.MaximumProductSubarray152.MaximumProductSubarray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LongestDuplicatedSubstring solution = new LongestDuplicatedSubstring();

        String result = solution.longestDupSubstring("abcd");
        System.out.println(result);
    }
}
