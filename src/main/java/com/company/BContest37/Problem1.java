package com.company.BContest37;

import java.util.Arrays;

public class Problem1 {
    public double trimMean(int[] arr) {
        int length = arr.length;
        int perc = (int) (length * 0.05);
        Arrays.sort(arr);
        double sum = 0;
        double counter = 0;
        for (int i = perc; i < arr.length - perc; i++) {
            sum += arr[i];
            counter++;
        }
        return sum / counter;
    }
}
