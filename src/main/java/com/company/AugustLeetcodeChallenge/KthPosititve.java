package com.company.AugustLeetcodeChallenge;

import java.util.HashSet;
import java.util.Set;

public class KthPosititve {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) set.add(i);
        int count = 0;

        for (int i = 1; count <= k; i++) {
            if(!set.contains(i)) {
                count++;
                if(count == k) return i;
            }
        }
        return count;
    }
}
