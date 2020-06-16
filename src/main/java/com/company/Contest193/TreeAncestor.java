package com.company.Contest193;

import java.util.*;

// TODO: TLE on the preprocessing stage. Need to learn binary lifting concept
public class TreeAncestor {
    int n;
    int[] parent;
    Map<String, Point> map;
    Map<Integer, Point> pointSet;
    public TreeAncestor(int n, int[] parent) {
        this.n = n;
        this.parent = parent;
        map = new HashMap<>();
        pointSet = new HashMap<>();
        this.buildTable();
    }

    public int getKthAncestor(int node, int k) {
        if (node < k) return -1;
        Point res = map.getOrDefault(key(node, k), null);
        return res == null ? -1 : res.val;
    }

    private String key(int node, int k) {
        return node + "#" + k;
    }

    private void buildTable() {
        for (int i = 0; i < n; i++) {
            pointSet.put(i, new Point(i));
            processParent(i);
        }
    }

    private void processParent(int node) {
        int counter = 1;
        int saved = node;
        while (node != -1) {
            if (!pointSet.containsKey(parent[node])) {
                pointSet.put(parent[node], new Point(parent[node]));
            }
            Point point = pointSet.get(parent[node]);
            String key = key(saved, counter++);
            map.put(key, point);
            node = parent[node];
        }
    }

    private class Point {
        int val;
        Point (int val) {
            this.val = val;
        }
    }
}
