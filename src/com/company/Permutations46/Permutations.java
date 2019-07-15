package com.company.Permutations46;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    private List<List<Integer>> result;

    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) list.add(nums[i]);

        backtrack(0, list);
        return result;
    }

    private void backtrack(int start, List<Integer> res) {
        if(start == res.size()) {
            result.add(new ArrayList<>(res));
        }

        for (int i = start; i < res.size(); i++) {
            swap(i, start, res);
            backtrack(start + 1, res);
            swap(i, start, res);
        }

    }

    private void swap(int left, int right, List<Integer> res) {
        int temp = res.get(left);
        res.set(left, res.get(right));
        res.set(right, temp);
    }
}
