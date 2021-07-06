package com.company.Contest190;

public class Problem4 {
    int[] nums1;
    int[] nums2;
    Integer[][] memo;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.memo = new Integer[nums1.length + 1][nums2.length + 1];
        return getMax(0, 0);
    }

    private int getMax(int start1, int start2) {
        if (start1 == this.nums1.length || start2 == this.nums2.length) {
            return Integer.MIN_VALUE / 2;
        }
        if (this.memo[start1][start2] != null) {
            return this.memo[start1][start2];
        }
        int curr = this.nums1[start1] * this.nums2[start2];
        int result = curr;
        result = Math.max(result, getMax(start1 + 1, start2));
        result = Math.max(result, getMax(start1 + 1, start2 + 1) + curr);
        result = Math.max(result, getMax(start1, start2 + 1));
        this.memo[start1][start2] = result;
        return result;
    }
}
