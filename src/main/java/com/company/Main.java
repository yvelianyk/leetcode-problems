package com.company;

import com.company.CombinationSumIV377.CombinationSumIV;
import com.company.DiceRollSimulation1223.DiceRollSimulation;
import com.company.TargetSum494.TargetSumA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DiceRollSimulation solution = new DiceRollSimulation();

        int result = solution.dieSimulator(2, new int[]{1,1,2,2,2,3});
        System.out.println(result);
    }
}
