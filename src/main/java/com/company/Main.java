package com.company;

import com.company.Contest164.Contest164Problem1;
import com.company.Contest164.Contest164Problem2;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Contest164Problem2 solution = new Contest164Problem2();

        int result = solution.countServers(new int[][]{{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}});

        System.out.println(result);

    }
}
