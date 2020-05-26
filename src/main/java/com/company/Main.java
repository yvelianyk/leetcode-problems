package com.company;

import com.company.CombinationSumIV377.CombinationSumIV;
import com.company.TargetSum494.TargetSumA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CombinationSumIV solution = new CombinationSumIV();

        int result = solution.combinationSum4(new int[]{1,2,3}, 4);
        System.out.println(result);
    }
}
