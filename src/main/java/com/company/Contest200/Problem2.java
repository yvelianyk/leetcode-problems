package com.company.Contest200;

public class Problem2 {
    public int getWinner(int[] arr, int k) {
        int winCount = 0;
        int winner = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > winner) {
                winCount = 1;
                winner = arr[i];
            } else {
                winCount++;
            }
            if (winCount == k) return winner;
        }
        return winner;
    }
}
