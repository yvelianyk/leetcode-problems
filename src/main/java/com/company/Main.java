package com.company;

import com.company.AsteroidCollision735.AsteroidCollision;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        AsteroidCollision solution = new AsteroidCollision(); // set the size to be 3
        int[] result = solution.asteroidCollision(new int[]{10,2,-5});
        System.out.println(result);
    }
}
