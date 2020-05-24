package com.company;

import com.company.Contest190.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();
        // [13,-7,12,-15,-7,8,3,-7,-5,13,-15,-8,5,7,-1,3,-11,-12,2,-12]
        //[-1,13,-4,-2,-13,2,-4,6,-9,13,-8,-3,-9]

        // [-9,2,8,14,9,3,-2,11,13,7,-9,14,11,8,1,10,12,-1,9,-4]
        //[6,3,8,-1,-5,0,1,-15,12,7]

        // [-8,-7,12,4,6,11,5,-5,9,11,-9,8,11,9]
        //[-15,-13,6,4,11,-14,-3,12,1,13,-7,-7,14,-1,9,1]
        int result = solution.maxDotProduct(new int[]{-1,-1}, new int[]{1,1});
        System.out.println(result);
    }
}
