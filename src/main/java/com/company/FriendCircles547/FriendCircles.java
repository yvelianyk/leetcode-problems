package com.company.FriendCircles547;

import java.util.HashSet;
import java.util.Set;

public class FriendCircles {
    private int[] root;
    private int[] size;
    int count;

    public int findCircleNum(int[][] M) {
        int len = M.length;
        root = new int[len];
        size = new int[len];
        count = len;
        for (int i = 0; i < len; i++) {
            root[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }

        return count;
    }

    private void union(int p, int q){
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
            size[rootQ] += sizeP;
        }
        count--;
    }

    private int findRoot(int p) {
        while (p != root[p]) {
            root[p] = root[root[p]];
            p = root[p];
        }
        return p;
    }
}