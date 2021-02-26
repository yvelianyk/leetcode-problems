package com.company;

import com.company.Challenges.ValidateStackSequences;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ValidateStackSequences solution = new ValidateStackSequences();

//        boolean result = solution.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,1,2});

//        boolean result = solution.validateStackSequences(new int[]{0}, new int[]{0});
//        [0,6,8,9,1,3,2,5,4,7]
//[6,0,4,9,1,2,3,7,8,5]

//        boolean result = solution.validateStackSequences(new int[]{0,6,8,9,1,3,2,5,4,7}, new int[]{6,0,4,9,1,2,3,7,8,5});

        boolean result = solution.validateStackSequences(new int[]{2,1,0}, new int[]{1,2,0});

        System.out.println(result);
    }
}
