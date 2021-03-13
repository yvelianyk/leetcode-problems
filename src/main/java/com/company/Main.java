package com.company;

import com.company.Challenges.BinaryTreesWithFactors;
import com.company.Challenges.HasAllCodes;
import com.company.Challenges.MinElemsGivenSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BinaryTreesWithFactors solution = new BinaryTreesWithFactors();

        int result = solution.numFactoredBinaryTrees(new int[]{2, 4, 5, 10});

        System.out.println(result);
    }
}
