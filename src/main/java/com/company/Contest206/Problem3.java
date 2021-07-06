package com.company.Contest206;

import java.util.PriorityQueue;

public class Problem3 {
    private int[] parent;
    private int[][] points;

    public int minCostConnectPoints(int[][] points) {
        parent = new int[points.length];
        for (int i = 0; i < parent.length; i++) parent[i] = i;
        this.points = points;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                pq.add(new int[]{this.getWeight(i, j), i, j});
            }
        }

        int result = 0;
        int counter = 0;
        while (counter < points.length - 1) {
            int[] curr = pq.poll();
            int left = curr[1];
            int right = curr[2];
            int parentLeft = findRoot(left);
            int parentRight = findRoot(right);
            if (parentLeft != parentRight) {
                result += curr[0];
                counter++;
                union(left, right);
            }
        }

        return result;
    }

    private int findRoot(int node) {
        while (node != parent[node]) {
            parent[node] = parent[parent[node]];
            node = parent[node];
        }
        return node;
    }

    private void union(int p, int q) {
        int rootP = findRoot(p);
        int rootQ = findRoot(q);

        parent[rootP] = parent[rootQ];
    }


    private int getWeight(int a, int b) {
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[a][1] - points[b][1]);
    }
}
