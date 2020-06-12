package com.company;

import com.company.LinkedListCycleII142.ListNode;
import com.company.MinCostTreeFromLeafNodes1130.MinCostTreeFromLeafNodes;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MinCostTreeFromLeafNodes solution = new MinCostTreeFromLeafNodes();
        int result = solution.mctFromLeafValues(new int[]{6,2,4});
        System.out.println(result);
    }
}
