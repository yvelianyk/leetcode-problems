package com.company;

import com.company.BContest41.Problem1;
import com.company.BContest41.Problem2;
import com.company.BContest41.Problem3;
import com.company.Challenges.PalindromePartitioning;
import com.company.Challenges.ValidMountainArray;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        PalindromePartitioning solution = new PalindromePartitioning();

        List<List<String>> res = solution.partition("aab");
        System.out.println(res);
    }
}
