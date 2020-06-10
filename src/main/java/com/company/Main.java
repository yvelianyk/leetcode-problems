package com.company;

import com.company.JuneLeetcodeChallenge.IsSubsequence;
import com.company.JuneLeetcodeChallenge.SearchInsertPosition;
import com.company.OutOfBoundaryPaths576.OutOfBoundaryPaths;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        OutOfBoundaryPaths solution = new OutOfBoundaryPaths();

        // int result = solution.findPaths(2,2,2,0,0);
        int result = solution.findPaths(1,3,3,0,1);
        System.out.println(result);
    }
}
