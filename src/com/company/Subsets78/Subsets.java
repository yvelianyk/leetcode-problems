package com.company.Subsets78;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    private List<List<Integer>> result;

    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        result.add(new ArrayList<>());

        permute(0, nums, new ArrayList<>());
        return result;
    }

    private void permute(int n, int[] nums, List<Integer> prev) {
        if (n == nums.length) return;

        for (int i = n; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> res = new ArrayList<>(prev);
            res.add(num);
            result.add(res);
            permute(i + 1, nums, res);
        }
    }
}
