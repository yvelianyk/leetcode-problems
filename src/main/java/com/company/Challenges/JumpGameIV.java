package com.company.Challenges;

import java.util.*;

// Could be optimized
public class JumpGameIV {
    private Map<Integer, List<Integer>> graph;
    private Map<Integer, List<Integer>> count;

    public int minJumps(int[] arr) {
        graph = new HashMap<>();
        count = new HashMap<>();
        buildGraph(arr);

        return BFS(arr);
    }

    private int BFS(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        queue.add(0);
        visited[0] = true;
        int result = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                if (current == arr.length - 1) {
                    return result;
                }
                List<Integer> children = graph.get(current);
                for (Integer child : children) {
                    if (!visited[child]) {
                        queue.add(child);
                        visited[child] = true;
                    }
                }
            }
            result++;
        }
        return result;
    }

    private void buildGraph(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            List<Integer> indices = count.getOrDefault(elem, new ArrayList<>());
            indices.add(i);
            count.put(elem, indices);
        }
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            List<Integer> children = graph.getOrDefault(i, new ArrayList<>());
            if (i > 0) children.add(i - 1);
            if (i < n - 1) children.add(i + 1);
            List<Integer> same = count.get(elem);
            for (Integer index : same) {
                if (index != i) children.add(index);
            }
            graph.put(i, children);
        }
    }

}
