package com.company;

import com.company.ThirtyDayChellenge.LastStoneWeight;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LastStoneWeight solution = new LastStoneWeight();
        int result = solution.lastStoneWeight(new int[]{1,2});
        System.out.println(result);
    }
}
