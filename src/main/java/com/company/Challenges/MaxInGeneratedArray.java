package com.company.Challenges;

public class MaxInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int counter = 1;
        int index = 1;
        int result = 0;
        while (index < arr.length - 1) {
            if (index % 2 != 0) {
                index = 2 * counter;
                arr[index] = arr[counter];
            } else {
                index = 2 * counter + 1;
                arr[index] = arr[counter] + arr[counter + 1];
                counter++;
            }
            result = Math.max(result, arr[index]);
        }
        return result;
    }
}
