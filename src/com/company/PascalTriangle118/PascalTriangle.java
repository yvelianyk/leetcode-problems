package com.company.PascalTriangle118;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) return result;

        List<Integer> first = new ArrayList<Integer>();
        first.add(1);
        result.add(first);

        for(int i = 1; i < numRows; i++) {
            List<Integer> prevList = result.get(i - 1);
            List<Integer> list = new ArrayList<Integer>();

            for (int j = 0; j < prevList.size() + 1; j++) {
                if (j == 0 || j == prevList.size()) {
                    list.add(1);
                    continue;
                }
                list.add(prevList.get(j) + prevList.get(j - 1));
            }
            result.add(list);
        }

        return result;
    }
}
