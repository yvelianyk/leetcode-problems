package com.company;

import com.company.MinimumCostForTickets983.MinimumCostForTickets;
import com.company.ThirtyDayChellenge.CountingNumbers;
import com.company.TwoKeysKeyboard650.TwoKeysKeyboard;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // TwoKeysKeyboard solution = new TwoKeysKeyboard();

        // int result = solution.minSteps(3);

        CountingNumbers solution = new CountingNumbers();
        int result = solution.countElements(new int[]{1,1,2,2});
        System.out.println(result);
    }
}
