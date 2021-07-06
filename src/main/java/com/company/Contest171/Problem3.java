package com.company.Contest171;

import java.util.*;

public class Problem3 {
    private int[] root;
    private int[] size;
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        root = new int[n];
        size = new int[n];
        for (int i = 0; i < root.length; i++) root[i] = i;

        int redundantCount = 0;

        for (int[] connection : connections) {
            if (!connected(connection[0], connection[1])) {
                union(connection[0], connection[1]);
            } else {
                redundantCount++;
            }
        }

        Set<Integer> distinctAreas = new HashSet<>();
        for (int value : root) {
            distinctAreas.add(findRoot(value));
        }

        return redundantCount + 1 < distinctAreas.size() ? -1 : distinctAreas.size() - 1;
    }

    // count sizes for the optimization
    // balancing trees
    private void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if(rootP == rootQ) return;

        if(size[rootP] < size[rootQ]) {
            root[rootP] = rootQ;
            size[rootQ] += size[rootP];
        } else {
            root[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
    }

    private int findRoot(int p) {
        while (p != root[p]) {
            root[p] = root[root[p]]; // path compression
            p = root[p];
        }
        return p;
    }

    private boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

}
