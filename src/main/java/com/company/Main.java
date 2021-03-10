package com.company;

import com.company.Challenges.IntegerToRoman;
import com.company.Challenges.OneSegments;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OneSegments solution = new OneSegments();

        boolean result = solution.checkOnesSegment("11");

        System.out.println(result);
    }
}
