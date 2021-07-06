package com.company.Challenges;

import java.util.*;

public class EvaluateDivision {
    Map<String, List<Edge>> graph;
    List<List<String>> equations;
    double[] values;
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        this.equations = equations;
        this.values = values;
        graph = new HashMap<>();
        buildGraph();
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++)
            result[i] = traverse(queries.get(i));
        return result;
    }

    private double traverse(List<String> query) {
        String start = query.get(0);
        String end = query.get(1);
        Set<String> visited = new HashSet<>();
        Queue<Item> queue = new LinkedList<>();
        queue.add(new Item(start, 1));

        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Item curr = queue.poll();
                if (curr.vertex.equals(end)) {
                    if (graph.containsKey(curr.vertex)) return curr.res;
                    return -1;
                }
                List<Edge> children = graph.getOrDefault(curr.vertex, new ArrayList<>());
                for (Edge child : children) {
                    if (!visited.contains(child.out)) {
                        queue.add(new Item(child.out, curr.res * child.weigth));
                        visited.add(child.out);
                    }
                }
            }
        }
        return -1;
    }

    private void buildGraph() {
        int counter = 0;
        for (List<String> equation : equations) {
            String in = equation.get(0);
            String out = equation.get(1);
            List<Edge> inEdges = graph.getOrDefault(in, new ArrayList<>());
            inEdges.add(new Edge(in, out, values[counter]));
            graph.put(in, inEdges);
            List<Edge> outEdges = graph.getOrDefault(out, new ArrayList<>());
            outEdges.add(new Edge(out, in , 1 / values[counter++]));
            graph.put(out, outEdges);
        }
    }

    class Item {
        String vertex;
        double res;
        Item(String vertex, double res) {
            this.vertex = vertex;
            this.res = res;
        }
    }

    class Edge {
        String in;
        String out;
        double weigth;
        Edge(String in, String out, double weight) {
            this.in = in;
            this.out = out;
            this.weigth = weight;
        }
    }
}
