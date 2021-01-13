package com.company;

import com.company.Challenges.BoatsToSavePeople;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BoatsToSavePeople solution = new BoatsToSavePeople();

        int res = solution.numRescueBoats(new int[]{1,2,2,3}, 4);
        System.out.println(res);
    }
}
