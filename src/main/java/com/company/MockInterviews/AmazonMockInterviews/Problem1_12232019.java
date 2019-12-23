package com.company.MockInterviews.AmazonMockInterviews;

// https://leetcode.com/problems/diet-plan-performance/submissions/
public class Problem1_12232019 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int left = 0;
        int right = k - 1;
        int initSum = 0;
        for (int i = 0; i <= right; i++) {
            initSum += calories[i];
        }
        int result = 0;
        if(k > 1) {
            while (right < calories.length) {
                if(initSum < lower) {
                    result--;
                }
                if(initSum > upper) {
                    result++;
                }
                initSum = initSum - calories[left++];
                if(++right < calories.length) {
                    initSum = initSum + calories[right];
                }
            }
        } else {
            for (int calory : calories) {
                if (calory < lower) result--;
                if (calory > upper) result++;
            }
        }

        return result;
    }
}
