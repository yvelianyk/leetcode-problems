package com.company;

import com.company.OnesAndZeroes474.OnesAndZeroes;
import com.company.ThirtyDayChellenge.LastStoneWeight;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OnesAndZeroes solution = new OnesAndZeroes();
        int result = solution.findMaxForm(new String[]{"10", "0001", "111001", "1", "0"},5,3);
        System.out.println(result);
    }
}
