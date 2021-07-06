package com.company.Contest206;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// TODO:
public class Problem4 {
    public boolean isTransformable(String s, String t) {
        if (s.equals(t)) return true;
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        for (char c : charsS) {
            int count = countS.getOrDefault(c, 0);
            countS.put(c, ++count);
        }
        for (char c : charsT) {
            int count = countT.getOrDefault(c, 0);
            countT.put(c, ++count);
        }

        for (Map.Entry<Character, Integer> entry : countS.entrySet()) {
            char c = entry.getKey();
            int sCount = entry.getValue();
            if (!countT.containsKey(c)) return false;
            int tCount = countT.get(c);
            if (sCount != tCount) return false;
        }

        Map<Character, Stack<Integer>> countMap = new HashMap<>();
        for (int i = charsT.length - 1; i >=0; i--) {
            Stack<Integer> stack = countMap.getOrDefault(charsT[i], new Stack<>());
            stack.push(i);
            countMap.put(charsT[i], stack);
        }

        for (int i = 0; i < charsS.length; i++) {
            char c = charsS[i];
            Stack<Integer> stack = countMap.get(c);
            int index = stack.pop();
            if (index > i) {
                int j = i;
                while (index != j) {
                    if (charsS[j + 1] > c) {
                        return false;
                    }
                    j++;
                }
            } else {
                int j = i;
                while (index != j) {
                    if (charsS[j - 1] < c) {
                        return false;
                    }
                    j--;
                }
            }
            countMap.put(c, stack);
        }
        return true;
    }

}
