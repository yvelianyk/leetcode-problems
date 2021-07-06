package com.company.Contest173;

import com.company.BContest16.Problem1;
import com.company.KClosestPointstoOrigin973.KClosestPointstoOrigin;

import java.util.*;

// TODO: https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/
// need some approach
public class Problem3 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        buildGraph(n, edges, graph);
        PriorityQueue<int[]> pq = new PriorityQueue<>(new HeapComparator());
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> inner = new HashMap<>();
            int cities = BFS(i, graph, inner, distanceThreshold);
            pq.add(new int[]{i, cities});
        }

        return pq.peek()[0];
    }

    private int BFS(int start, Map<Integer, Map<Integer, Integer>> graph, Map<Integer, Integer> inner, int distanceThreshold) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                Map<Integer, Integer> children = graph.get(node);
                for (Map.Entry<Integer, Integer> entry : children.entrySet()) {
                    if (!visited.contains(entry.getKey())) {
                        queue.add(entry.getKey());
                        inner.put(entry.getKey(),inner.getOrDefault(node, 0) + entry.getValue());
                        visited.add(entry.getKey());
                    }
                }
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : inner.entrySet()) {
            if(entry.getValue() <= distanceThreshold) {
                count++;
            }
        }

        return count;
    }

    private void buildGraph(int n, int[][] edges, Map<Integer, Map<Integer, Integer>> graph) {
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashMap<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).put(edge[1], edge[2]);
            graph.get(edge[1]).put(edge[0], edge[2]);
        }
    }

    class HeapComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] val1, int[] val2) {
            if(val1[1] > val2[1]) return 1;
            if(val1[1] < val2[1]) return -1;
            return Integer.compare(val2[0], val1[0]);
        }
    }
}
