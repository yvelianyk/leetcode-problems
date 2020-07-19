package com.company.CourseScheduleII210;

import com.company.Contest198.Problem2;

import java.util.*;

public class CourseScheduleII {

    private Map<Integer, List<Integer>> graph;
    private List<Integer> topologicalSortOrder;
    private int[] visited;
    private boolean hasCycle = false;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        graph = new HashMap<>();
        visited = new int[numCourses];
        buildGraph(prerequisites);
        topologicalSortOrder = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) DFS(i, new HashSet<>());

        if (hasCycle) return new int[]{};
        int[] result = new int[numCourses];
        for (int i = 0; i < result.length; i++)
            result[i] = topologicalSortOrder.get(i);
        return result;
    }

    private void DFS(int node, Set<Integer> callSet) {
        if (callSet.contains(node)) hasCycle = true;
        if (hasCycle || visited[node] == 1) return;

        visited[node] = 1;
        callSet.add(node);
        List<Integer> children = graph.getOrDefault(node, new ArrayList<>());
        for (Integer child : children) DFS(child, callSet);
        callSet.remove(node);
        topologicalSortOrder.add(node);
    }

    private void buildGraph(int[][] edges) {
        for (int[] edge : edges) {
            List<Integer> children1 = graph.getOrDefault(edge[0], new ArrayList<>());
            children1.add(edge[1]);
            graph.put(edge[0], children1);
        }
    }

}
