package com.company;

import com.company.Challenges.IntegerToRoman;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        IntegerToRoman solution = new IntegerToRoman();

        String result = solution.intToRoman(2998);

        System.out.println(result);
    }
}
