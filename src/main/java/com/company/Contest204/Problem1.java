package com.company.Contest204;

import java.util.Arrays;

public class Problem1 {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (checkPattern(arr, i, m, k)) return true;
        }
        return false;
    }

    private boolean checkPattern(int[] arr, int start, int m, int k) {
        int count = 0;
        int next = start + m - 1;
        while (next < arr.length && count < k) {
            start = start + m;
            next = next + m;
            boolean res = true;
            if (next >= arr.length) res = false;
            for (int i = start; i <= next && next < arr.length; i++) {
                int i1 = arr[i];
                int prev = arr[i - m];
                if (i1 != prev) {
                    res = false;
                    count = 0;
                    break;
                }
            }
            if (res) {
                if (count == 0) {
                    count = 2;
                } else {
                    count++;
                }
            }
        }
        return count >= k;
    }

}
