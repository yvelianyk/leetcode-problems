package com.company.contest13;

import java.util.*;

// https://leetcode.com/contest/biweekly-contest-13
public class Contest13Task2 {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        Map<String, String> relations = new HashMap<>();
        for (List<String> region : regions) {
            for (int i = 1; i < region.size(); i++) {
                relations.put(region.get(i), region.get(0));
            }
        }
        Set<String> ancestors1 = new HashSet<>();
        ancestors1.add(region1);
        String parent = relations.get(region1);
        while (parent != null) {
            ancestors1.add(parent);
            parent = relations.get(parent);
        }

        while (!ancestors1.contains(region2)) region2 = relations.get(region2);

        return region2;
    }
}
