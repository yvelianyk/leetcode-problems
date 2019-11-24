package com.company;

import com.company.ArrayTransformation1243.ArrayTransformation;
import com.company.CheckIfItIsaStraightLine1232.CheckIfItIsaStraightLine;
import com.company.RemoveSubfolders1233.RemoveSubfolders;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayTransformation solution = new ArrayTransformation();

        // List<Integer> result = solution.transformArray(new int[]{1,6,3,4,3,5});
        List<Integer> result = solution.transformArray(new int[]{2,1,2,1,1,2,2,1});

        System.out.println(result);

    }
}
