package com.company.Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class FreqStack {
    Map<Integer, Integer> freqMap; // <element, frequency>
    TreeMap<Integer, Stack<Integer>> elems; // <freqency, elements>

    public FreqStack() {
        freqMap = new HashMap<>();
        elems = new TreeMap<>();
    }

    public void push(int x) {
        int freq = freqMap.getOrDefault(x, 0);
        Stack<Integer> same = elems.getOrDefault(freq + 1, new Stack<>());
        same.push(x);
        freqMap.put(x, freq + 1);
        elems.put(freq + 1, same);
    }

    public int pop() {
        Stack<Integer> stack = elems.lastEntry().getValue();
        int res = stack.pop();
        if (stack.isEmpty()) {
            elems.pollLastEntry();
        }
        freqMap.put(res, freqMap.get(res) - 1);
        if (freqMap.get(res) == 0) {
            freqMap.remove(res);
        }
        return res;
    }
}
