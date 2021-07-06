package com.company.MockInterviews.GMockInterviews.Mock10032020;

import java.util.*;

// TODO: Dijkstra
public class Problem2 {
    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<Integer>> graphMap = new HashMap<>();
        Map<String, Integer> timeMap = new HashMap<>();

        for (int[] time : times) {
            timeMap.put(Integer.toString(time[0]).concat(Integer.toString(time[1])), time[2]);
        }

        for (int i = 1; i <= N; i++) {
            graphMap.put(i, new ArrayList<>());
        }
        for (int[] time : times) {
            List<Integer> childred = graphMap.getOrDefault(time[0], new ArrayList<>());
            childred.add(time[1]);
            graphMap.put(time[0], childred);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        Set<Integer> visited = new HashSet<>();
        queue.add(new int[]{K, 0});
        int counter = 1;
        int result = 0;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            if (visited.contains(node[0])) continue;
            visited.add(node[0]);
            counter++;
            result = Math.max(result, node[1]);
            List<Integer> children = graphMap.get(node[0]);
            for (Integer child : children) {
                String key = Integer.toString(node[0]).concat(Integer.toString(child));
                int time = timeMap.get(key);
                if (!visited.contains(child)) {
                    queue.add(new int[]{child, node[1] + time});
                }
            }
        }

        if (counter != N) return -1;
        return result;
    }
}
