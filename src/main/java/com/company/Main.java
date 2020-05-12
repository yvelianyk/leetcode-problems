package com.company;

import com.company.MayLeetCodeChallenge.SingleElementInSortedArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SingleElementInSortedArray solution = new SingleElementInSortedArray();

        int result = solution.singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8});
        System.out.println(result);
    }
}
