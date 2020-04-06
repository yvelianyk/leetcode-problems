package com.company;

import com.company.MinimumCostForTickets983.MinimumCostForTickets;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimumCostForTickets solution = new MinimumCostForTickets();

        int result = solution.mincostTickets(new int[]{1,2,3,4,5,6,7,8,9,10,30,31}, new int[]{2,7,15});
        System.out.println(result);
    }
}
