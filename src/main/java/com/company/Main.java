package com.company;

import com.company.Challenges.SetMismatch;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SetMismatch solution = new SetMismatch();

//        int[] result = solution.findErrorNums(new int[]{2,2});

        int[] result = solution.findErrorNums(new int[]{1,2,2,4});

        System.out.println(result);
    }
}
