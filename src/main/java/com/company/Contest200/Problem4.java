package com.company.Contest200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    private int[] nums1;
    private int[] nums2;
    private Map<Long, Integer> map1;
    private Map<Long, Integer> map2;
    private long[][] memo;
    private final int MOD = 1_000_000_007;

    public int maxSum(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.map1 = new HashMap<>();
        this.map2 = new HashMap<>();
        int maxL = Math.max(nums1.length, nums2.length);
        this.memo = new long[2][maxL];

        for (int i = 0; i < nums1.length; i++) map1.put((long) nums1[i], i);
        for (int i = 0; i < nums2.length; i++) map2.put((long) nums2[i], i);

        return (int) (Math.max(getMax(0, 0), getMax(0, 1)) % MOD);
    }

    // arr = 0 - first array, arr = 1 - second array
    private long getMax(int index, int arr) {
        if ((arr == 0 && index >= nums1.length) || (arr == 1 && index >= nums2.length))
            return 0;
        if (memo[arr][index] != 0) return memo[arr][index];

        long number = arr == 0 ? nums1[index] : nums2[index];
        long result;
        long maxSkip = number + getMax(index + 1, arr);
        if (arr == 0) {
            long max1NoSkip = Integer.MIN_VALUE;
            if (map1.containsKey(number) && map2.containsKey(number)) {
                max1NoSkip = number + getMax(map2.get(number) + 1, 1);
            }
            result = Math.max(maxSkip, max1NoSkip);
        } else {
            long max2NoSkip = Integer.MIN_VALUE;
            if (map1.containsKey(number) && map2.containsKey(number)) {
                max2NoSkip = number + getMax(map1.get(number) + 1, 0);
            }
            result = Math.max(maxSkip, max2NoSkip);
        }

        memo[arr][index] = result;
        return result;
    }
}
