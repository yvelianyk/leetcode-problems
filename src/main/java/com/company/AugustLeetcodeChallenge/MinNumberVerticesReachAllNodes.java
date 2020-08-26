package com.company.AugustLeetcodeChallenge;

import java.util.*;

// Complicated solution but it works
//public class MinNumberVerticesReachAllNodes {
//    Map<Integer, List<Integer>> graph;
//    int n;
//    Set<Integer> visited;
//    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
//        this.n = n;
//        visited = new HashSet<>();
//        graph = new HashMap<>();
//        buildGraph(edges);
//
//        for (int i = 0; i < n; i++) traverse(i);
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < n; i++) if (!visited.contains(i)) result.add(i);
//        return result;
//    }
//
//    private void traverse(int node) {
//        List<Integer> children = graph.get(node);
//        for (Integer child : children) {
//            if (!visited.contains(child)) {
//                visited.add(child);
//                traverse(child);
//            }
//        }
//    }
//
//    private void buildGraph(List<List<Integer>> edges) {
//        for (int i = 0; i < n; i++) graph.put(i, new ArrayList<>());
//        for (List<Integer> edge : edges) {
//            List<Integer> children = graph.get(edge.get(0));
//            children.add(edge.get(1));
//            graph.put(edge.get(0), children);
//        }
//    }
//}

public class MinNumberVerticesReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        boolean[] hasParent = new boolean[n];
        for (List<Integer> edge : edges) hasParent[edge.get(0)] = true;
        for (int i = 0; i < n; i++) if (!hasParent[i]) result.add(i);
        return result;
    }


}
