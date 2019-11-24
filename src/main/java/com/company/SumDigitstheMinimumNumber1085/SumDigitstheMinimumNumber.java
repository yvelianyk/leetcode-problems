package com.company.SumDigitstheMinimumNumber1085;

public class SumDigitstheMinimumNumber {
    public int sumOfDigits(int[] A) {
        int min = 1000;
        for (int i = 0; i < A.length; i++) {
            int i1 = A[i];
            min = Math.min(i1, min);
        }

        int sum = 0;
        while (min > 0) {
            sum += min % 10;
            min = min / 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}
