package com.company;


import com.company.Contest186.Problem1;
import com.company.Contest186.Problem2;
import com.company.Contest186.Problem4;
import com.company.Contest186.Problem4BottomUp;
import com.company.ThirtyDayChellenge.LongestCommonSubsequence;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LongestCommonSubsequence solution = new LongestCommonSubsequence();
        // [-5266,4019,7336,-3681,-5767]
        //2
        int result = solution.longestCommonSubsequence("abdeace", "ace");
        System.out.println(result);
    }
}
