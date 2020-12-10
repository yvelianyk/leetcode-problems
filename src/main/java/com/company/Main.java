package com.company;

import com.company.Challenges.ValidMountainArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ValidMountainArray solution = new ValidMountainArray();
        boolean res = solution.validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0});
        System.out.println(res);
    }
}
