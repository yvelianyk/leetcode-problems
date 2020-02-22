package com.company;

import com.company.BContest20.Cashier;
import com.company.BContest20.Problem1;
import com.company.BContest20.Problem3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();
        int count = solution.numberOfSubstrings("abcabc");
        System.out.println(count);
    }
}
