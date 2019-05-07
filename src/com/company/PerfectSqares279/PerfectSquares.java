package com.company.PerfectSqares279;

import java.util.*;

public class PerfectSquares {

    // TIME LIMIT EXCEEDED
    public int numSquares(int n) {
            ArrayList<Integer> squareNums = new ArrayList<Integer>();
            for (int i = 1; i < n; i++) {
                 int square = i*i;
                 if(square < n) squareNums.add(square);
                 if(square == n) return 1;
            }
            int level = 1;
            Queue<Integer> queue = new LinkedList<Integer>();
            Set<Integer> visited = new HashSet<Integer>();
            for (Integer squareNum : squareNums) {
                queue.add(squareNum);
                visited.add(squareNum);
            }

            while (!queue.isEmpty()) {
                int size = queue.size();
                level++;
                for (int i = 0; i < size; i++) {
                    int curr = queue.poll();
                    for (Integer squareNum : squareNums) {
                        int sum = curr + squareNum;
                        if(sum == n) return level;
                        if(!visited.contains(sum)) {
                            queue.add(sum);
                        }
                    }
                }
            }

            return level;
    }


    // WORKING SOLUTION
    public int numSquares2(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int level = 0;
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                if (!set.add(curr)) continue;
                ArrayList<Integer> squareNums = getSquareNums(curr);
                for (Integer squareNum : squareNums) {
                   int next = curr - squareNum;
                   if(next == 0) return level;
                   if(!set.contains(next)) {
                       queue.add(next);
                   }
                }
            }
        }
        return level;
    }

    private ArrayList<Integer> getSquareNums(int n) {
        ArrayList<Integer> squareNums = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            int square = i*i;
            if(square <= n) squareNums.add(square);
        }

        return squareNums;
    }

}
