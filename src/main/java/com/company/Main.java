package com.company;


import com.company.Contest186.Problem1;
import com.company.Contest186.Problem2;
import com.company.Contest186.Problem4;
import com.company.Contest186.Problem4BottomUp;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4BottomUp solution = new Problem4BottomUp();
        // [-5266,4019,7336,-3681,-5767]
        //2
        int result = solution.constrainedSubsetSum(new int[]{10,-2,-10,-5,20}, 2);
        System.out.println(result);
    }
}
