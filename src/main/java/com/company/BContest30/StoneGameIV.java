package com.company.BContest30;

// TODO: think of this solution
public class StoneGameIV {
    private Boolean[] memo;

    public boolean winnerSquareGame(int n) {
        memo = new Boolean[n + 1];
        return play(n);
    }

    boolean play(int n) {
        if (n == 0) return false;
        if (memo[n] != null) return memo[n];
        boolean result = false;
        for (int i = (int) Math.sqrt(n); i > 0; i--) {
            if (!play(n - (i * i))) {
                result = true;
                break;
            }
        }
        memo[n] = result;
        return result;
    }
}
