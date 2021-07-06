package com.company.DiceRollSimulation1223;

// TODO: it was very hard to understand for me.
// But, eventually I've figured it out
public class DiceRollSimulation {
    int modulo = 1000000007;
    int memo[][][];
    int[] rollMax;
    public int dieSimulator(int n, int[] rollMax) {
        this.rollMax = rollMax;
        this.memo = new int[n + 1][7][16];
        return getWays(n,  0, 0);
    }

    private int getWays(int n, int last, int count) {
        if (n == 0) return 1;
        if (this.memo[n][last][count] != 0) return this.memo[n][last][count];

        int result = 0;
        for (int i = 1; i <= 6; i++) {
            if (count == rollMax[i - 1] && last == i) continue;
            int newCount = i == last ? count + 1 : 1;
            result = (result + getWays(n - 1, i, newCount)) % modulo;
        }

        this.memo[n][last][count] = result;
        return result;
    }
}
