package com.company.GraphValidTree261;

import java.util.HashSet;
import java.util.Set;

public class GraphValidTree {
    private int[] root;
    private int[] size;

    public boolean validTree(int n, int[][] edges) {
        root = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            root[i] = i;
            size[i] = 1;
        }

        for (int[] edge : edges) union(edge[0], edge[1]);
        Set<Integer> components = new HashSet<>();

        for (int parent : root) components.add(findRoot(parent));
        return components.size() == 1 && edges.length == n - 1;
    }

    private void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if (rootP == rootQ) return;

        int sizeP = size[rootP];
        int sizeQ = size[rootQ];
        if (sizeP > sizeQ) {
            root[rootQ] = rootP;
            size[rootP] += sizeQ;
        } else {
            root[rootP] = rootQ;
            size[rootQ] += rootP;
        }
    }

    private int findRoot(int p) {
        while (p != root[p]) {
            root[p] = root[root[p]];
            p = root[p];
        }
        return p;
    }
}
