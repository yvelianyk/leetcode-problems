package com.company;

import com.company.BalancedStringSplit1221.BalancedStringSplit;

public class Main {

    public static void main(String[] args) {
        BalancedStringSplit solution = new BalancedStringSplit();
        int result = solution.balancedStringSplit("RRLRRRL");
        //int result = solution.balancedStringSplit("RLRRLLRLRL");
        System.out.println("RESULT: " + result);
    }
}
