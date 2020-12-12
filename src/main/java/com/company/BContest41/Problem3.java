package com.company.BContest41;

import java.util.Arrays;

public class Problem3 {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        Pair[] pairs = new Pair[aliceValues.length];
        for (int i = 0; i < aliceValues.length; i++) {
            int aliceValue = aliceValues[i];
            int bobValue = bobValues[i];
            pairs[i] = new Pair(aliceValue + bobValue, i);
        }
        Arrays.sort(pairs, (a, b) -> b.sum - a.sum);
        boolean isAliceMove = true;
        int aliceResult = 0;
        int bobResult = 0;
        for (Pair pair : pairs) {
            if (isAliceMove) {
                aliceResult += aliceValues[pair.index];
            } else {
                bobResult += bobValues[pair.index];
            }
            isAliceMove = !isAliceMove;

        }
        return Integer.compare(aliceResult, bobResult);
    }

    class Pair {
        int sum;
        int index;
        Pair(int sum, int index) {
            this.sum = sum;
            this.index = index;
        }
    }
}
