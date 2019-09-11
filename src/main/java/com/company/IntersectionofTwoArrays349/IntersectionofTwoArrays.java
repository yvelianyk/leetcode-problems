package com.company.IntersectionofTwoArrays349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            int elem1 = nums1[i];
            if(!set1.contains(elem1)) set1.add(elem1);
        }

        for (int i = 0; i < nums2.length; i++) {
            int i1 = nums2[i];
            if(set1.contains(i1) && !set2.contains(i1)) set2.add(i1);
        }

        int[] res = new int[set2.size()];
        int counter = 0;
        for (Integer integer : set2) res[counter++] = integer;
        return res;
    }
}
