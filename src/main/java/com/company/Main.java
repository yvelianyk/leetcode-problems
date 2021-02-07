package com.company;

import com.company.Challenges.MinimizeDeviationInArray;
import com.company.Challenges.MinimumDeletions;
import com.company.Challenges.ShortestPathToChar;
import com.company.Challenges.SimplifyPath;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ShortestPathToChar solution = new ShortestPathToChar();

        int[] res = solution.shortestToChar("loveleetcode", 'e');

        System.out.println(res);
    }
}
