package com.company.TheEarliestMomentWhenEveryoneBecomeFriends1101;

import java.util.Arrays;

public class TheEarliestMomentWhenEveryoneBecomeFriends {
    private int[] root;
    private int[] size;
    private int count;

    public int earliestAcq(int[][] logs, int N) {
        root = new int[N];
        size = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            root[i] = i;
            size[i] = 1;
        }

        Arrays.sort(logs, (a, b) -> a[0] - b[0]);

        for (int[] log : logs) {
            union(log[1], log[2]);
            if(count == 1) return log[0];
        }
        return -1;
    }

    private void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);
        if (rootP == rootQ) return;

        int sizeP = size[p];
        int sizeQ = size[q];
        if (sizeP > sizeQ) {
            root[rootQ] = rootP;
            size[rootP] += sizeQ;
        } else {
            root[rootP] = rootQ;
            size[rootQ] += sizeP;
        }
        count--;
    }

    private int findRoot(int node) {
        while (node != root[node]) {
            root[node] = root[root[node]];
            node = root[node];
        }
        return node;
    }
}
