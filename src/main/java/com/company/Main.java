package com.company;

import com.company.Contest17.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        int result = solution.distinctEchoSubstrings("abcabcabc");
        // int result = solution.distinctEchoSubstrings("aacabcabc");
        System.out.println(result);

    }
}
