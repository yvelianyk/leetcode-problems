package com.company.Contest181;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        int[] finalRes = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result = insert(result, nums[i], index[i]);
        }

        System.arraycopy(result, 0, finalRes, 0, finalRes.length);
        return finalRes;
    }

    private int[] insert(int[] a, int key, int index) {
        List<Integer> result = IntStream.of(a)
                .boxed()
                .collect(Collectors.toList());
        result.add(index, key);

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
