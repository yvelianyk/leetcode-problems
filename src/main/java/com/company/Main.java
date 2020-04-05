package com.company;



import com.company.Contest183.Problem1;
import com.company.Contest183.Problem4;
import com.company.MinimumPathSum64.MinimumPathSum;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        MinimumPathSum solution = new MinimumPathSum();

        int result = solution.minPathSum(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1},
        });
        System.out.println(result);
    }
}
