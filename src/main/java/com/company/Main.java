package com.company;

import com.company.Challenges.HasAllCodes;
import com.company.Challenges.MinElemsGivenSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        HasAllCodes solution = new HasAllCodes();

        boolean result = solution.hasAllCodes("00110", 2);

        System.out.println(result);
    }
}
