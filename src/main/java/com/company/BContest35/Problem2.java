package com.company.BContest35;

import com.company.BContest16.Problem1;

import java.util.*;

// 1,2,3,4,5
// reqs = [0,2] [1,3]
// itars:
// 1,0,1,0,0
// 1,0,0,-1,0
// 1,1,0,-1,-1
// prefix sum
// 1,2,2,1,0
public class Problem2 {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        long modulo = 1_000_000_007;
        int n = nums.length;
        int[] freq = new int[n];

        for (int[] request : requests) {
            int first = request[0];
            int last = request[1];
            freq[first]++;
            if (last + 1 < n) freq[last + 1]--;
        }
        for (int i = 1; i < freq.length; i++) freq[i] += freq[i - 1];
        Arrays.sort(nums);
        Arrays.sort(freq);
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            long res1 = (nums[i] * freq[i]) % modulo;
            result = (result + res1) % modulo;
        }
        return (int) result;
    }
}
