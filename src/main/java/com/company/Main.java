package com.company;

import com.company.CountVowelsPermutation1220.CountVowelsPermutation;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CountVowelsPermutation solution = new CountVowelsPermutation();

        int result = solution.countVowelPermutation(5);
        System.out.println(result);
    }
}
