package com.company;


import com.company.BContest24.Problem4;
import com.company.CoinChange322.Solution;
import com.company.NumberOfIslands200.NumberOfIslandsUF;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Problem4 solution = new Problem4();

        int result = solution.numberOfArrays("1317", 2000);

        System.out.println(result);
    }
}
