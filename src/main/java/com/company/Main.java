package com.company;

import com.company.BContest42.Problem1;
import com.company.BContest42.Problem2;
import com.company.Challenges.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CheckArrayFormation solution = new CheckArrayFormation();

//        boolean res = solution.canFormArray(new int[]{91,4,64,78}, new int[][]{{78},{4,64},{91} });
        boolean res = solution.canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}});

        System.out.println(res);
    }
}
