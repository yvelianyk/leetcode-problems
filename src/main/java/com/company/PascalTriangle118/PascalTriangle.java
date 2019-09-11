package com.company.PascalTriangle118;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

    private Map<Integer, Integer> cache = new HashMap<>();

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) row.add(getValue(i, j));
            result.add(row);
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
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<List<Integer>>();
//        if (numRows == 0) return result;
//
//        List<Integer> first = new ArrayList<Integer>();
//        first.add(1);
//        result.add(first);
//
//        for(int i = 1; i < numRows; i++) {
//            List<Integer> prevList = result.get(i - 1);
//            List<Integer> list = new ArrayList<Integer>();
//
//            for (int j = 0; j < prevList.size() + 1; j++) {
//                if (j == 0 || j == prevList.size()) {
//                    list.add(1);
//                    continue;
//                }
//                list.add(prevList.get(j) + prevList.get(j - 1));
//            }
//            result.add(list);
//        }
//
//        return result;
//    }
}
