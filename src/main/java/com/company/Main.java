package com.company;


import com.company.MakeArrayStrictlyIncreasing1187.MakeArrayStrictlyIncreasing;
import com.company.MaximumSizeSubarraySumEqualsK325.MaximumSizeSubarraySumEqualsK;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaximumSizeSubarraySumEqualsK solution = new MaximumSizeSubarraySumEqualsK();

        // [1,5,3,6,7]
        //[1,6,3,3]
        int result = solution.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3);
        System.out.println(result);
    }
}
