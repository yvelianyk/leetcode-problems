package com.company.Challenges;

import java.util.TreeSet;

// TODO: possible to do it by O(n). This one is O(n log(n))
public class ShortestPathToChar {
    public int[] shortestToChar(String s, char c) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int len = s.length();
        for(int i = 0;i < len; i++) {
            if (s.charAt(i) == c) treeSet.add(i);
        }
        int[] result = new int[len];
        for(int i = 0;i < len; i++) {
            if (s.charAt(i) == c) continue;
            Integer higher = treeSet.higher(i);
            Integer lower = treeSet.lower(i);
            if (higher == null) {
                result[i] = i - lower;
                continue;
            }
            if (lower == null){
                result[i] = higher - i;
                continue;
            }
            int diffLower = i - lower;
            int diffHigher = higher - i;
            result[i] = Math.min(diffLower, diffHigher);
        }
        return result;
    }
}
