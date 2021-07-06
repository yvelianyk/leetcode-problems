package com.company.contest13;

// https://leetcode.com/contest/biweekly-contest-13
public class Contest13Task1 {
    // Very stupid task
    public String encode(int num) {
        return Integer.toBinaryString(num + 1).substring(1);
    }
}
