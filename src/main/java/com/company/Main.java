package com.company;

import com.company.MaximumProductSubarray152.MaximumProductSubarray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        MaximumProductSubarray solution = new MaximumProductSubarray();

        int result = solution.maxProduct(new int[]{-2,3,-4});
        System.out.println(result);
    }
}
