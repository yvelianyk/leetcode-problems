package com.company;

import com.company.Challenges.MaxNumberOfKSumPairs;
import com.company.Challenges.SmallestStringWithNumericValue;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SmallestStringWithNumericValue solution = new SmallestStringWithNumericValue();

        String res = solution.getSmallestString(5, 73);

        System.out.println(res);
    }
}
