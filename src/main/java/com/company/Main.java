package com.company;


import com.company.Contest187.Problem2;
import com.company.Contest187.Problem4;
import com.company.MakeArrayStrictlyIncreasing1187.MakeArrayStrictlyIncreasing;
import com.company.MaximumSizeSubarraySumEqualsK325.MaximumSizeSubarraySumEqualsK;
import com.company.MayLeetCodeChallenge.RansomNote;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();
        int result = solution.kthSmallest(new int[][]{
                {1,3,11},
                {2,4,6},
        }, 9);
        System.out.println(result);
//        RansomNote solution = new RansomNote();
//        boolean result = solution.canConstruct("aa", "aab");
    }
}
