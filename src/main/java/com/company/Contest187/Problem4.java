package com.company.Contest187;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

// TODO: looks like I got it but still
public class Problem4 {
    public int kthSmallest(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (getSum(mat, a) - getSum(mat, b)));
        pq.add(new int[mat.length]);
        int sum = 0;
        int steps = 0;
        Set<String> visited = new HashSet<String>();
        while(!pq.isEmpty() && steps < k) {
            int[] min = pq.remove();
            sum = getSum(mat, min);
            for(int i = 0; i < min.length; i++) {
                int[] copy = min.clone();
                if(copy[i] < mat[0].length - 1) copy[i]++;
                if(visited.contains(Arrays.toString(copy))) continue;
                visited.add(Arrays.toString(copy));
                pq.add(copy);
            }
            steps++;
        }
        return sum;
    }

    public int getSum(int[][] mat, int[] a) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][a[i]];
        }
        return sum;
    }
}
