package com.company.MockInterviews.AmazonMockInterviews.Mock12272019;

import java.util.*;

// https://leetcode.com/problems/critical-connections-in-a-network/
// TODO: figure out how to find if some node in the graph in the cycle or not
public class Problem2 {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < connections.size(); i++) {
            int first = connections.get(i).get(0);
            int second = connections.get(i).get(1);

            List<Integer> firstAdj = graph.getOrDefault(first, new ArrayList<>());
            firstAdj.add(second);
            graph.put(first, firstAdj);
            List<Integer> secondAdj = graph.getOrDefault(second, new ArrayList<>());
            secondAdj.add(first);
            graph.put(second, secondAdj);
        }


        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            List<Integer> entryConnections = entry.getValue();
        }

        return result;
    }}
