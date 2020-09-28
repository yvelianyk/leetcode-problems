package com.company.BContest35;

public class Problem1 {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0;
        for (int i = 1; i <= n; i = i + 2) {
            for (int j = 0; j < n; j++) {
                int intRes = 0;
                if (j + i <= n) {
                    for (int k = j; k < i + j; k++) {
                        intRes += arr[k];
                    }
                }
                result += intRes;
            }
        }
        return result;
    }
}
