package com.company;

import com.company.MaximalSquare221.MaximalSquare;
import com.company.OnesAndZeroes474.OnesAndZeroes;
import com.company.ThirtyDayChellenge.ContiguousArray;
import com.company.ThirtyDayChellenge.LastStoneWeight;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ContiguousArray solution = new ContiguousArray();
        int result = solution.findMaxLength(new int[]{0,1,0,1,0,1,1,1});
        System.out.println(result);
    }
}
