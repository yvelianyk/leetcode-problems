package com.company.Contest166;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contest166Problem2 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> result = new HashMap<>();
        List<List<Integer>> finalResult = new ArrayList<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            int number = map.getOrDefault(groupSize, 0);
            number++;
            map.put(groupSize, number);
        }

        for (int i = 0; i < groupSizes.length; i++) {
            int groupSize = groupSizes[i];
            List<Integer> list = result.getOrDefault(groupSize, new ArrayList<>());
            list.add(i);
            if (list.size() == groupSize) {
                result.put(groupSize, new ArrayList<>());
                finalResult.add(list);
            } else {
                result.put(groupSize, list);
            }
        }

        return finalResult;
    }
}
