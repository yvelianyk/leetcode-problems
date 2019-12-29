package com.company.Contest169;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class Problem1 {
    public int[] sumZero(int n) {
        int start = -(n / 2);

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if(start == 0) {
                if (n % 2 == 1) {
                    result[i] = start++;
                } else {
                    i--;
                    start++;
                }
            } else {
                result[i] = start++;
            }

        }
        return result;
    }
}
