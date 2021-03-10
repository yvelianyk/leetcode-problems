package com.company;

import com.company.Challenges.MinElemsGivenSum;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinElemsGivenSum solution = new MinElemsGivenSum();

        int result = solution.minElements(new int[]{1,-1,1}, 3,-4);

//        int result = solution.minElements(new int[]{1,-10,9,1}, 100,0);

        System.out.println(result);
    }
}
