package com.company;

import com.company.Challenges.MinOperationsToReduceXToZero;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinOperationsToReduceXToZero solution = new MinOperationsToReduceXToZero();

        int res = solution.minOperations(new int[]{5,6,7,8,9}, 4);
        System.out.println(res);
    }
}
