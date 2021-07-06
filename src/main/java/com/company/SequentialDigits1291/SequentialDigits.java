package com.company.SequentialDigits1291;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        List<Integer> lowDigits = getNumberInfo(low);
        List<Integer> highDigits = getNumberInfo(high);

        for (int size = lowDigits.size(); size <= highDigits.size(); size++) {
            for (int j = 1; j < 9 - size + 2; j++) {
                int num = 0;
                int power = size - 1;
                for (int i = j; i <= size + j; i++) {
                    num += i * (int) Math.pow(10, power--);
                }
                if (power == -2 && num >= low && num <= high) {
                    result.add(num);
                }
            }
        }
        return result;
    }

    private List<Integer> getNumberInfo(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        return digits;
    }
}
