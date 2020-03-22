package com.company.BContest22;

public class Problem1 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        for (int i1 : arr1) {
            boolean flag = true;
            for (int i2 : arr2) {
                if (Math.abs(i1 - i2) <= d) {
                    flag = false;
                    break;
                }
            }
            if (flag) result++;
        }
        return result;
    }
}
