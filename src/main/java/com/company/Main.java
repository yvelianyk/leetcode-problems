package com.company;

import com.company.BContest30.MinDiffLargSmall3Moves;
import com.company.BContest30.RangeSumOfSubarraySums;
import com.company.BContest30.StoneGameIV;
import com.company.IslandPerimeter463.IslandPerimeter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StoneGameIV solution = new StoneGameIV();

        boolean result = solution.winnerSquareGame(6);
        System.out.println(result);
    }
}
