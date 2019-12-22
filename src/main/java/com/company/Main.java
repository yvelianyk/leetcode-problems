package com.company;

import com.company.Contest168.Problem2;
import com.company.Contest168.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        int result = solution.maxFreq("aababcaab", 2,3,4);
//        int result = solution.maxFreq("abcde", 2,3,3);

        System.out.println(result);

    }
}
