package com.company.Challenges;

import java.util.*;

public class BipartiteGraph {

    public boolean isBipartite(int[][] graph) {
        int[] visited = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (graph[i].length != 0 && visited[i] == 0) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = 1;
                while (!queue.isEmpty()) {
                    int curr = queue.poll();
                    int[] children = graph[curr];
                    for (int child : children) {
                        if (visited[child] == 0) {
                            queue.add(child);
                            visited[child] = visited[curr] == 1 ? 2 : 1;
                        } else {
                            if (visited[child] == visited[curr])
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
