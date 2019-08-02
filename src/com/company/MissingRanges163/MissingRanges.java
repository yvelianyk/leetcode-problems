package com.company.MissingRanges163;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {

        ArrayList<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            result.add(createString(lower, upper));
            return result;
        }

        long prev = nums[0];

        if (prev > lower) {
            result.add(createString(lower, prev - 1));
        }

        for (int i = 1; i < nums.length; i++) {
            long current = nums[i];
            if (prev + 1 < current) {
                result.add(createString(prev + 1, current - 1));
            }
            prev = current;
        }

        if (prev < upper) result.add(createString(prev + 1, upper));

        return result;

    }

    private String createString(long lo, long hi) {
        if (lo == hi)
            return String.valueOf(lo);
        else {
            return String.valueOf(lo) + "->" + String.valueOf(hi);
        }
    }
}
