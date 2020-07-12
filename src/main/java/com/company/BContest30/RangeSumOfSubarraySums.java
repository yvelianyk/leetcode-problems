package com.company.BContest30;

import java.util.PriorityQueue;

public class RangeSumOfSubarraySums {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int modulo = 1_000_000_007;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                pq.add(sum % modulo);
            }
        }

        int res = 0;
        int count = 0;
        while (count < right) {
            count++;
            int curr = pq.poll();
            if (count >= left && count <= right ) res = (res + curr) % modulo;
        }
        return res;
    }
}
