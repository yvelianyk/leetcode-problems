package com.company;

import com.company.MockInterviews.AMockInterviews.Mock01102020.Problem1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem1 solution = new Problem1();

        String result = solution.longestPalindrome("cabasabc");
        System.out.println(result);

    }
}
