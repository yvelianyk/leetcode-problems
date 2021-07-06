package com.company.TargetSum494;

import java.util.*;

public class TargetSum {

    // TIME LIMIT EXCEEDED:
//    public int findTargetSumWays(int[] nums, int S) {
//        Stack<Point> stack = new Stack<Point>();
//
//        Point first = new Point(-1, 0);
//        stack.push(first);
//        int count = 0;
//        int counter = 0;
//        while (!stack.isEmpty()) {
//            counter++;
//            Point current = stack.pop();
//
//            if (current.index == nums.length - 1 && current.sum == S) {
//                count++;
//            }
//
//            int index = current.index == nums.length - 1 ? current.index : current.index + 1;
//
//            Point newPoint = new Point(index, current.sum + nums[index]);
//            Point newPoint1 = new Point(index, current.sum - nums[index]);
//
//            if (current.index != nums.length - 1) {
//                stack.push(newPoint);
//                stack.push(newPoint1);
//            }
//        }
//
//        System.out.println("COUNTER: " + counter);
//        return count;
//    }

    class Point {
        int index;
        int sum;
        Point(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }

    // BRUTE FORCE RECURSION
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        helper(nums, 0, 0, S);
        return count;
    }

    private void helper(int[] nums, int index, int sum, int S) {
        if(index == nums.length) {
            if (sum == S) count++;
        } else {
            helper(nums, index + 1, sum + nums[index], S);
            helper(nums, index + 1, sum - nums[index], S);
        }
    }

    // MEMOIZATION:

    public class Solution {

        public int findTargetSumWays(int[] nums, int S) {
            int[][] memo = new int[nums.length][2001];
            for (int[] row: memo)
                Arrays.fill(row, Integer.MIN_VALUE);
            return calculate(nums, 0, 0, S, memo);
        }
        public int calculate(int[] nums, int i, int sum, int S, int[][] memo) {
            if (i == nums.length) {
                if (sum == S)
                    return 1;
                else
                    return 0;
            } else {
                if (memo[i][sum + 1000] != Integer.MIN_VALUE) {
                    return memo[i][sum + 1000];
                }
                int add = calculate(nums, i + 1, sum + nums[i], S, memo);
                int subtract = calculate(nums, i + 1, sum - nums[i], S, memo);
                memo[i][sum + 1000] = add + subtract;
                return memo[i][sum + 1000];
            }
        }
    }

}
