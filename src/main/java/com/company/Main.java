package com.company;



import com.company.Contest183.Problem1;
import com.company.Contest183.Problem4;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        String result = solution.stoneGameIII(new int[]{-1,-2,-3});
        System.out.println(result);
    }
}
