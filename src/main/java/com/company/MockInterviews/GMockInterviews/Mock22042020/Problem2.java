package com.company.MockInterviews.GMockInterviews.Mock22042020;

import java.util.*;

// TODO: it is not working solution
//public class Problem2 {
//    public int[] gardenNoAdj(int N, int[][] paths) {
//        Map<Integer, Node> graph = new HashMap<>();
//        buildGraph(paths, graph, N);
//        int[] visited = new int[N + 1];
//        List<Integer> result = new ArrayList<>();
//
//        Map<Integer, Integer> colors = new HashMap();
//        for (int i = 1; i <= N; i++) {
//            Node node = graph.get(i);
//            if (visited[node.number] != 1) {
//                DFS(node, visited, result, colors);
//            }
//        }
//        int[] res = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//             res[i] = result.get(i);
//        }
//        return res;
//    }
//
//    private void DFS(Node node, int[] visited, List<Integer> result, Map<Integer, Integer> colors) {
//        Set<Integer> neighbourColors = new HashSet<>();
//        for (Node child : node.children) {
//            if (colors.containsKey(child.flower)) {
//                neighbourColors.add(colors.get(child.number));
//            }
//            neighbourColors.add(child.flower);
//        }
//        for (int i = 1; i <= 4; i++) {
//            if (!neighbourColors.contains(i)) {
//                node.flower = i;
//                colors.put(node.number, i);
//                break;
//            }
//        }
//        visited[node.number] = 1;
//        for (Node child : node.children) {
//            if(visited[child.number] == 0) {
//                DFS(child, visited, result);
//            }
//        }
//    }
//
//    private void buildGraph(int[][] connections, Map<Integer, Node> graph, int N) {
//        for (int i = 1; i <= N; i++) {
//            graph.put(i, new Node(i));
//        }
//        for (int[] connection : connections) {
//            int first = connection[0];
//            int second = connection[1];
//
//            Node firstNode = graph.getOrDefault(first, new Node(first));
//            Node secondNode = graph.getOrDefault(second, new Node(second));
//
//            firstNode.children.add(secondNode);
//            secondNode.children.add(firstNode);
//            graph.put(first, firstNode);
//            graph.put(second, secondNode);
//        }
//    }
//
//    class Node {
//        List<Node> children;
//        int number;
//        int flower;
//
//        Node(int number) {
//            this.flower = 0;
//            this.number = number;
//            this.children = new ArrayList<>();
//        }
//    }
//}
