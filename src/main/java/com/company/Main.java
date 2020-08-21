package com.company;

import com.company.AugustLeetcodeChallenge.MinDaysToEatNOranges;
import com.company.AugustLeetcodeChallenge.SortArrayByParity;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SortArrayByParity solution = new SortArrayByParity();
        int[] result = solution.sortArrayByParity(new int[]{3,12,2,3,3,4,5,6,4,3,2,3,3,5,6,7,1,2,4});
        System.out.println(result);
    }
}
