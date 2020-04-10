package com.company;

import com.company.LastStoneWeightII1049.LastStoneWeightII;
import com.company.LinkedListCycleII142.ListNode;
import com.company.PerfectSqares279.PerfectSquaresDP;
import com.company.ThirtyDayChellenge.MiddleLinkedList;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        LastStoneWeightII solution = new LastStoneWeightII();

        int result = solution.lastStoneWeightII(new int[]{2,7,4,1,8,1});
        //int result = solution.lastStoneWeightII(new int[]{2,1,6,4,5});

        System.out.println(result);
    }
}
