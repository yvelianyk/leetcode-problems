package com.company;

import com.company.CellsInOddMatrix.CellsInOddMatrix;
import com.company.ReconstructMatrix2D.ReconstructMatrix2D;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ReconstructMatrix2D solution = new ReconstructMatrix2D();

        List<List<Integer>> result = solution.reconstructMatrix(2,1, new int[]{1,1,1});
        System.out.println("RESULT: " + result);
    }
}
