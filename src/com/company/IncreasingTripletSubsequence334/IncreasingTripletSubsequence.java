package com.company.IncreasingTripletSubsequence334;

// https://leetcode.com/problems/increasing-triplet-subsequence/
public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int elem = nums[i];
            if(elem > max) {
                return true;
            }
            if (elem <= min) {
                min = elem;
            } else {
                max = elem;
            }
        }

        return false;
    }
}
