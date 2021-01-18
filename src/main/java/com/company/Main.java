package com.company;

import com.company.Challenges.MaxNumberOfKSumPairs;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaxNumberOfKSumPairs solution = new MaxNumberOfKSumPairs();

        int res = solution.maxOperations(new int[]{1,2,3,4}, 5);

//        int res = solution.maxOperations(new int[]{3,5,1,5}, 2);
//        int res = solution.maxOperations(new int[]{3,1,3,4,3}, 6);
        System.out.println(res);
    }
}
