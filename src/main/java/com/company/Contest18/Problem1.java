package com.company.Contest18;

import com.company.KClosestPointstoOrigin973.KClosestPointstoOrigin;

import java.util.*;

public class Problem1 {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) treeMap.put(arr[i], i);

        int[] result = new int[arr.length];

        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            rankMap.put(entry.getKey(), counter++);
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }

}
