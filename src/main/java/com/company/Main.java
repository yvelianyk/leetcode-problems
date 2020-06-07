package com.company;

import com.company.Contest192.Problem4;
import com.company.JuneLeetcodeChallenge.CoinChange2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CoinChange2 solution = new CoinChange2();

        int result = solution.change(5, new int[]{1,2,5});
        System.out.println(result);
    }
}
