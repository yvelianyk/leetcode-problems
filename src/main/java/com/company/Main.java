package com.company;

import com.company.CountOfNiceSubarray1248.CountOfNiceSubarray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CountOfNiceSubarray solution = new CountOfNiceSubarray();

        int result = solution.numberOfSubarrays(new int[]{2,1,2,1,2,2,1,2}, 2);

        System.out.println(result);

    }
}
