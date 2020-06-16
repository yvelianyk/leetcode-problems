package com.company;

import com.company.Contest193.Problem2;
import com.company.Contest193.Problem3;
import com.company.Contest193.TreeAncestor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 treeAncestor = new Problem3();
        int res = treeAncestor.minDays(new int[]{7,7,7,7,12,7,7}, 2, 3);
        System.out.println(res);
    }
}
