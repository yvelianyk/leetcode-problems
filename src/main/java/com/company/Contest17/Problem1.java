package com.company.Contest17;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            int count = nums[i];
            int elem = nums[i+1];
            for (int j = 0; j < count; j++) {
                result.add(elem);
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }
}
