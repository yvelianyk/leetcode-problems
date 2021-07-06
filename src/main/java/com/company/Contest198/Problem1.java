package com.company.Contest198;

public class Problem1 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int newBottles;
        while (numBottles >= numExchange) {
            newBottles = numBottles / numExchange;
            numBottles = newBottles + numBottles - (newBottles * numExchange);
            result += newBottles;
        }
        return result;
    }
}
