package com.company.MockInterviews.GMockInterviews.Mock25042020;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    int[][] memo;
    boolean[][] bool;
    public boolean divisorGame(int N) {
        memo = new int[N + 1][2];
        bool = new boolean[N + 1][2];
        return getResult(N, 1);
    }

    private boolean getResult(int N, int isAlice) {
        if (N <= 1) {
            return isAlice != 1;
        }
        if (memo[N][isAlice] != 0) {
            return bool[N][isAlice];
        }

        boolean resultA = false;
        boolean resultB = true;
        List<Integer> possibleNums = getPossibleNums(N);

        if (isAlice == 1) {
            for (Integer possibleNum : possibleNums) {
                resultA = resultA | getResult(N - possibleNum, 0);
            }
        } else {
            for (Integer possibleNum : possibleNums) {
                resultB = resultB & getResult(N - possibleNum, 1);
            }
        }

        bool[N][isAlice] = isAlice == 1 ? resultA : resultB;
        memo[N][isAlice] = 1;
        return bool[N][isAlice];
    }

    private List<Integer> getPossibleNums(int N) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < N; i++) {
            if (N % i == 0) result.add(i);
        }
        return result;
    }}
