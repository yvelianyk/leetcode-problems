package com.company;

import java.util.HashSet;
import java.util.Set;

public class NumberOfConnectedCmpts323 {
    private int[] sizes;
    private int[] roots;

    public int countComponents(int n, int[][] edges) {
        roots = new int[n];
        sizes = new int[n];
        for (int i = 0; i < n; i++) {
            roots[i] = i;
            sizes[i] = 1;
        }

        for (int[] edge : edges) union(edge[0], edge[1]);

        Set<Integer> components = new HashSet<>();
        for (int parent : roots) components.add(findRoot(parent));

        return components.size();
    }

    // Find root with path compression
    private int findRoot(int node) {
        while (node != roots[node]) {
            roots[node] = roots[roots[node]];
            node = roots[node];
        }
        return node;
    }

    // Union with tree balancing
    private void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if (rootP == rootQ) return;

        int sizeP = sizes[rootP];
        int sizeQ = sizes[rootQ];
        if (sizeP < sizeQ) {
            roots[rootP] = rootQ;
            sizes[rootQ] += sizes[rootP];
        } else {
            roots[rootQ] = rootP;
            sizes[rootP] += sizes[rootQ];
        }
    }
}
