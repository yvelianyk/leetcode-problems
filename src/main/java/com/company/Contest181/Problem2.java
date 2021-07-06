package com.company.Contest181;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer> divisorsNum = divisors(nums[i]);
            if (divisorsNum.size() == 4) {
                result += divisorsNum.stream()
                        .mapToInt(Integer::intValue)
                        .sum();
            }
        }
        return result;
    }

    private List<Integer> divisors(int n) {
        List<Integer> result = new ArrayList<>();
        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n%i==0) {
                if (n/i == i)
                    result.add(i);
                else
                {
                    result.add(i);
                    result.add(n/i);
                }
            }

        }
        return result;
    }
}
