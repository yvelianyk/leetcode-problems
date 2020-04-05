package com.company.Contest183;
// TODO:
public class Problem4 {
    public String stoneGameIII(int[] stoneValue) {
        int alice = 0;
        int bob = 0;
        int index = 0;
        boolean isAlice = true;
        while (index <= stoneValue.length - 1) {
            int[] best = getBest(index, stoneValue);
            index = best[1] + 1;
            if (isAlice) {
                alice += best[0];
            } else {
                bob += best[0];
            }
            isAlice = !isAlice;
        }

        if (alice > bob) return "Alice";
        if (alice < bob) return "Bob";
        return "Tie";
    }

    private int[] getBest(int start, int[] values) {
        int result = values[start];
        int index = start;
        if (start == values.length - 1) return new int[]{result, start};
        for (int i = start + 1; i < start + 3; i++) {
            if (i >= values.length) continue;
            int value = values[i];
            if (value >= 0) {
                result += value;
                index++;
            }
        }
        return new int[]{result,index};
    }

}
