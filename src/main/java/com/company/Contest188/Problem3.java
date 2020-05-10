package com.company.Contest188;

import java.util.*;

public class Problem3 {
    List<Boolean> hasApple;
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, Node> graph = new HashMap<>();
        this.hasApple = hasApple;
        buildGraph(edges, graph);
        Node root = graph.get(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(root.number);

        return DFS(root, visited);
    }

    private int DFS (Node node, Set<Integer> visited) {
        List<Node> children = node.children;
        int result = 0;
        if (node.children != null) {
            for (Node child : children) {
                if (visited.contains(child.number)) continue;
                visited.add(child.number);
                result += DFS(child, visited);
            }
        }
        if (result == 0) {
            return node.hasApple ? 2 : 0;
        } else {
            return result + (node.number == 0 ? 0 : 2);
        }
    }

    private void buildGraph(int[][] connections, Map<Integer, Node> graph) {
        for (int[] connection : connections) {
            int first = connection[0];
            int second = connection[1];

            Node firstNode = graph.getOrDefault(first, new Node(first, hasApple.get(first)));
            Node secondNode = graph.getOrDefault(second, new Node(second, hasApple.get(second)));

            firstNode.children.add(secondNode);
            secondNode.children.add(firstNode);
            graph.put(first, firstNode);
            graph.put(second, secondNode);
        }
    }

    private class Node {
        List<Node> children;
        int number;
        boolean hasApple;

        Node(int number, boolean hasApple) {
            this.hasApple = hasApple;
            this.number = number;
            this.children = new ArrayList<>();
        }
    }
}
