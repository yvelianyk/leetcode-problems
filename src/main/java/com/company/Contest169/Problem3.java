package com.company.Contest169;

// https://leetcode.com/problems/jump-game-iii/
public class Problem3 {
    private boolean result = false;

    public boolean canReach(int[] arr, int start) {
        int[] visited = new int[arr.length];
        dfs(arr, visited, start);
        return this.result;
    }

    private void dfs(int[] arr, int[] visited, int start) {
        if (start > arr.length - 1 || start < 0) return;
        if (visited[start] != 0) {
            return;
        }
        if (arr[start] == 0) {
            this.result = true;
            return;
        }
        visited[start] = 1;

        dfs(arr, visited, start + arr[start]);
        dfs(arr, visited, start - arr[start]);
    }
}
