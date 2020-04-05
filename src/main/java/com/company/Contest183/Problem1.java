package com.company.Contest183;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Problem1 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for (int num : nums) pq.add(num);
        List<Integer> result = new ArrayList<>();
        int currSum = 0;
        while (!pq.isEmpty()) {
            int elem = pq.poll();
            currSum += elem;
            int leftSum = sum - currSum;
            result.add(elem);
            if (currSum > leftSum) {
                break;
            }
        }
        return result;
    }
}
