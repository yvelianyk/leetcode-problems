package com.company.JuneLeetcodeChallenge;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestPrice {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] graph = new int[n][n];
        for (int[] flight : flights) graph[flight[0]][flight[1]] = flight[2];

        int result = Integer.MAX_VALUE;
        int[] minPrices = new int[n];
        Arrays.fill(minPrices, Integer.MAX_VALUE);
        minPrices[src] = 0;

        Queue<Edge> queue = new LinkedList<>();
        queue.add(new Edge(src, 0));

        while (!queue.isEmpty() && K >= 0) {
            int size = queue.size();
            K--;
            for (int i = 0; i < size; i++) {
                Edge currentEdge = queue.poll();
                for (int j = 0; j < graph[currentEdge.val].length; j++) {
                    int price = graph[currentEdge.val][j];
                    if (price == 0) continue;
                    int currPrice =  currentEdge.price + price;
                    int prevPrice = minPrices[j];
                    if (currPrice < prevPrice) {
                        minPrices[j] = currPrice;
                        queue.add(new Edge(j, currPrice));
                        if (j == dst && currPrice < result) {
                            result = currPrice;
                        }
                    }
                }
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    private class Edge {
        int val;
        int price;
        Edge(int val, int price) {
            this.val = val;
            this.price = price;
        }
    }

}
