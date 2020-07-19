package com.company.Contest198;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2 {
    Map<Integer, List<Node>> graph;
    Map<Integer, Map<Character, Integer>> graphLabels;
    int[] result;
    int[] visited;
    int n;
    String labels;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        graph = new HashMap<>();
        graphLabels = new HashMap<>();
        this.labels = labels;
        this.n = n;
        result = new int[n];
        visited = new int[n];
        buildGraph(edges);
        countLabelsDFS(0);
        for (int i = 0; i < n; i++) {
            result[i] = graphLabels.get(i).get(labels.charAt(i));
        }
        return result;
    }

    private void countLabelsDFS(int node) {
        if (visited[node] == 1) return;
        List<Node> children = graph.get(node);
        visited[node] = 1;
        Map<Character, Integer> labelsCount = graphLabels.get(node);

        for (Node child : children) {
            if (visited[child.number] == 1) continue;
            countLabelsDFS(child.number);
            Map<Character, Integer> labelsChild = graphLabels.get(child.number);
            for (Map.Entry<Character, Integer> entry : labelsChild.entrySet()) {
                int count = entry.getValue();
                char character = entry.getKey();
                int parentCharCount = labelsCount.getOrDefault(character, 0);
                labelsCount.put(character, parentCharCount + count);
            }
        }
    }

    private void buildGraph(int[][] edges) {
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            map.put(labels.charAt(i), 1);
            graphLabels.put(i, map);
        }
        for (int[] edge : edges) {
            List<Node> children1 = graph.getOrDefault(edge[0], new ArrayList<>());
            List<Node> children2 = graph.getOrDefault(edge[1], new ArrayList<>());
            children1.add(new Node(edge[1]));
            children2.add(new Node(edge[0]));
            graph.put(edge[0], children1);
            graph.put(edge[1], children2);
        }
    }

    class Node {
        int number;
        Node(int number) {
            this.number = number;
        }
    }
}
