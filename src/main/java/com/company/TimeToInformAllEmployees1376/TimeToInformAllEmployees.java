package com.company.TimeToInformAllEmployees1376;

import java.util.*;

public class TimeToInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int result = 0;
        for (int i = 0; i < manager.length; i++) {
            int managerId = manager[i];
            if (managerId == -1) continue;
            if (!graph.containsKey(managerId)) {
                graph.put(managerId, new HashSet<>());
            }
            graph.get(managerId).add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> timeMap = new HashMap<>();
        timeMap.put(headID, 0);
        queue.add(headID);
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                int preTime = timeMap.get(current);
                Set<Integer> element = graph.get(current);
                if (element == null) continue;
                for (Integer el : element) {
                    timeMap.put(el, preTime + informTime[current]);
                    queue.add(el);
                    result = Math.max(result, preTime + informTime[current]);
                }
            }
        }

        return result;
    }
}
