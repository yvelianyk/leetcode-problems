package com.company;

import com.company.Contest166.Contest166Problem2;
import com.company.Contest166.Contest166Problem3;
import com.company.MinimumAreaRectangle939.MinimumAreaRectangle;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Contest166Problem3 solution = new Contest166Problem3();
        int result = solution.smallestDivisor(new int[]{2,3,5,7,11}, 11);

        System.out.println(result);

    }
}
