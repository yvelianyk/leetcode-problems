package com.company.PascalsTriangleII119;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalsTriangleII {

    // RECURSIVE SOLUTION:
    private Map<Integer, Integer> cache = new HashMap<>();

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            result.add(getValue(rowIndex + 1, i));
        }
        return result;
    }

    private int getValue(int i, int j) {
        if (j == 1 || j == i) return 1;
        int hashKey = getHashKey(i, j);
        if (cache.containsKey(hashKey)) {
            return cache.get(hashKey);
        }
        int value = getValue(i - 1, j - 1) + getValue(i - 1, j);
        cache.put(hashKey, value);
        return value;
    }

    private int getHashKey(int i, int j) {
        return i * 100 + j;
    }


    // ITERATIVE:
//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> result = new ArrayList<Integer>();
//        result.add(1);
//        if(rowIndex == 0) return result;
//        result.add(1);
//        if(rowIndex == 1) return result;
//
//        for (int i = 1; i < rowIndex; i++) {
//            int k = 0;
//            List<Integer> tempRes = new ArrayList<Integer>();
//            tempRes.add(1);
//            while (k < i) {
//                int temp = result.get(k++) + result.get(k);
//                tempRes.add(temp);
//            }
//            tempRes.add(1);
//            result = tempRes;
//        }
//
//        return result;
//    }
}
