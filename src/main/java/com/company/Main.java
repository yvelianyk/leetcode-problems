package com.company;


import com.company.Contest186.Problem1;
import com.company.Contest186.Problem2;
import com.company.Contest186.Problem4;
import com.company.Contest186.Problem4BottomUp;
import com.company.MakeArrayStrictlyIncreasing1187.MakeArrayStrictlyIncreasing;
import com.company.ThirtyDayChellenge.FirstUnique;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MakeArrayStrictlyIncreasing solution = new MakeArrayStrictlyIncreasing();

        // [1,5,3,6,7]
        //[1,6,3,3]
        int result = solution.makeArrayIncreasing(new int[]{1,5,3,6,7}, new int[]{1,6,3,3});
        System.out.println(result);
    }
}
