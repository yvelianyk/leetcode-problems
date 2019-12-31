package com.company.MockInterviews.AmazonMockInterviews.Mock12272019;

import java.util.*;

// https://leetcode.com/problems/critical-connections-in-a-network/
public class Problem2 {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        Map<Integer, Node> graph = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        buildGraph(connections, graph);

        Node root = graph.get(connections.get(0).get(0));

        int[] disc = new int[n];
        int[] low = new int[n];
        int[] visited = new int[n];

        DFS(root, disc, low, -1, visited, 0, result);

        return result;
    }

    private void DFS(Node node, int[] disc, int[] low, int parent, int[] visited, int counter, List<List<Integer>> result) {
        disc[node.number] = counter + 1;
        low[node.number] = counter + 1;
        visited[node.number] = 1;

        for (Node child : node.children) {
            if (child.number == parent) {
                continue;
            }
            if (visited[child.number] == 0) {
                DFS(child, disc, low, node.number, visited, ++counter, result);
                low[node.number] = Math.min(low[node.number], low[child.number]);
                if(low[child.number] > disc[node.number]) {
                    List<Integer> res = new ArrayList<>();
                    res.add(node.number);
                    res.add(child.number);
                    result.add(res);
                }
            } else {
                low[node.number] = Math.min(low[node.number], disc[child.number]);
            }
        }
    }

    private void buildGraph(List<List<Integer>> connections, Map<Integer, Node> graph) {
        for (List<Integer> connection : connections) {
            int first = connection.get(0);
            int second = connection.get(1);

            Node firstNode = graph.getOrDefault(first, new Node(first));
            Node secondNode = graph.getOrDefault(second, new Node(second));

            firstNode.children.add(secondNode);
            secondNode.children.add(firstNode);
            graph.put(first, firstNode);
            graph.put(second, secondNode);
        }
    }

    private class Node {
        List<Node> children;
        int number;

        Node(int number) {
            this.number = number;
            this.children = new ArrayList<>();
        }
    }
}
