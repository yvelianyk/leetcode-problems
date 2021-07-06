package com.company.Contest168;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Problem1 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digits = getNumberOfDigits(num);
            if(digits % 2 == 0 && digits > 0) {
                count++;
            }
        }
        return count;
    }

    private int getNumberOfDigits(int number) {
        int numberOfDigits = 0;

        while(number > 0) {
            numberOfDigits++;
            number = number / 10;
        }
        return numberOfDigits;
    }
}
