package com.company.JuneLeetcodeChallenge;

import java.util.*;

public class AllPathsFromSourceToTarget {
    List<List<Integer>> result;
    int[][] graph;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        result = new ArrayList<>();
        this.graph = graph;
        List<Integer> innerList = new ArrayList<>();
        innerList.add(0);
        traverse(0, -1, innerList);
        return result;
    }

    private void traverse(int node, int parent, List<Integer> list) {
        int[] children = graph[node];
        if (children.length == 0) result.add(new ArrayList(list));

        for (Integer child : children) {
            if (child == parent) continue;
            list.add(child);
            traverse(child, node, list);
            list.remove(list.size() - 1);
        }

    }

}
