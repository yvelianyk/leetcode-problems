package com.company.FindtheDuplicateNumber287;

import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateNumber {

    // TODO: in the linked list topic learn how to detect cycles on the list
    // turtois - hare principle(two pointers: one faster and one slower)
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
