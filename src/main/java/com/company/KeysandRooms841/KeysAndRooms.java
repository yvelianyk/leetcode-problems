package com.company.KeysandRooms841;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int currentKey = stack.pop();
            visited.add(currentKey);
            for (int nextKey : rooms.get(currentKey)) {
                if(!visited.contains(nextKey)) stack.push(nextKey);
            }
        }

        return visited.size() == rooms.size();
    }
}
