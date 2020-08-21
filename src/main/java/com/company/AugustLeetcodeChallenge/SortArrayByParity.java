package com.company.AugustLeetcodeChallenge;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int index = 0;
        for (int i : A) if (i % 2 == 0) result[index++] = i;
        for (int i : A) if (i % 2 != 0) result[index++] = i;
        return result;
    }
}
