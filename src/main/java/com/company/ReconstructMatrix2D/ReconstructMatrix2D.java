package com.company.ReconstructMatrix2D;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/
public class ReconstructMatrix2D {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> matrix = new ArrayList<>();
        int total = 0;
        int half = 0;
        for (int innerSum : colsum) {
            total += innerSum;
            half += innerSum / 2;
        }

        if (total != upper + lower || upper < half || lower < half) return new ArrayList<>();


        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        matrix.add(first);
        matrix.add(second);

        for (int i = 0; i < colsum.length; i++) {
            int sum = colsum[i];

            if (sum == 0) {
                first.add(0);
                second.add(0);
            }
            if (sum == 2) {
                first.add(1);
                second.add(1);
            }

            if (sum == 1) {
                first.add(upper > lower ? 1 : 0);
                second.add(upper > lower ? 0 : 1);
            }
            upper -= first.get(i);
            lower -= second.get(i);
        }
        return matrix;
    }
}
