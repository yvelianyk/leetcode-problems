package com.company.Challenges;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    // mismatch
    // [1,2,2,4]
    // 2,3 - duplicate 2, missed - 3
    // [1,1]
    // [1,2] - duplicate - 1, missed - 2
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> dupSet = new HashSet<>();
        int length = nums.length;
        int duplicate = 0;
        for (int i = 1; i <= length; i++) set.add(i);
        for (int num : nums) {
            if (dupSet.contains(num)) duplicate = num;
            dupSet.add(num);
            set.remove(num);
        }
        int missed = set.iterator().next();

        return new int[]{duplicate, missed};
    }
}
