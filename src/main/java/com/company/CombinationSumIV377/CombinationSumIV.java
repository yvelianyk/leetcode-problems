package com.company.CombinationSumIV377;

import java.util.HashMap;
import java.util.Map;

public class CombinationSumIV {
    int[] nums;
    Map<Integer, Integer> memo;
    public int combinationSum4(int[] nums, int target) {
        this.nums = nums;
        this.memo = new HashMap<>();
        return getNum(target);
    }

    private int getNum(int targetSum) {
        if (targetSum == 0) return 1;
        if (targetSum < 0) return 0;
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        int result = 0;
        for (int num : nums) result += getNum(targetSum - num);
        memo.put(targetSum, result);
        return result;
    }
}
