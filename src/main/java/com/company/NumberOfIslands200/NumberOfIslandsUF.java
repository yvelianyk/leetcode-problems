package com.company.NumberOfIslands200;

public class NumberOfIslandsUF {
    int[][] dirs = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    char[][] grid;
    int count;

    public int numIslands(char[][] grid) {
        if (grid.length == 0) return 0;
        this.grid = grid;
        int cols = grid.length;
        int rows = grid[0].length;
        UF uf = new UF(cols * rows);
        count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    connectAdj(i, j, uf);
                }
            }
        }
        return count;
    }

    private void connectAdj(int i, int j, UF uf) {
        int ufCurrCoord = grid[0].length * i + j;
        for (int[] dir : dirs) {
            int newI = i + dir[0];
            int newJ = j + dir[1];
            if (newI >= 0 &&
                    newI < grid.length &&
                    newJ >= 0 &&
                    newJ < grid[0].length &&
                    grid[newI][newJ] == '1'
            ) {
                int ufCoord = grid[0].length * newI + newJ;

                if (uf.union(ufCurrCoord, ufCoord)) {
                    count--;
                }
            }
        }
    }

    class UF {
        int[] size;
        int[] root;

        UF(int n) {
            size = new int[n];
            root = new int[n];
            for (int i = 0; i < root.length; i++) {
                root[i] = i;
                size[i] = 1;
            }
        }

        public int findRoot(int node) {
            while (node != root[node]) {
                root[node] = root[root[node]];
                node = root[node];
            }
            return node;
        }

        private boolean union(int p, int q) {
            int rootP = findRoot(p);
            int rootQ = findRoot(q);
            if (rootP == rootQ) return false;
            int sizeP = size[rootP];
            int sizeQ = size[rootQ];
            if (sizeP > sizeQ) {
                root[rootQ] = rootP;
                size[rootP] += sizeQ;
            } else {
                root[rootP] = rootQ;
                size[rootQ] += sizeP;
            }
            return true;
        }
    }
}
