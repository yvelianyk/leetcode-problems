package com.company;

import com.company.CombinationSumIV377.CombinationSumIV;
import com.company.DiceRollSimulation1223.DiceRollSimulation;
import com.company.PartitionalEqualSubsetSum416.PartitionalEqualSubsetSum;
import com.company.TargetSum494.TargetSumA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        PartitionalEqualSubsetSum solution = new PartitionalEqualSubsetSum();

        boolean result = solution.canPartition(new int[]{1,2,3,4,5,6,7});
        System.out.println(result);
    }
}
