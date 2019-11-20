package com.company.PlaywithChips1217;

public class PlayWithChips {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < chips.length; i++) {
            int chip = chips[i];
            if (chip % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
