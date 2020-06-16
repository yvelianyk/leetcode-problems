package com.company;

import com.company.Contest193.Problem2;
import com.company.Contest193.TreeAncestor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TreeAncestor treeAncestor = new TreeAncestor(7, new int[]{-1, 0, 0, 1, 1, 2, 2});
        int res1 = treeAncestor.getKthAncestor(3, 1);  // returns 1 which is the parent of 3
        int res2 = treeAncestor.getKthAncestor(5, 2);  // returns 0 which is the grandparent of 5
        int res3 = treeAncestor.getKthAncestor(6, 3);  // returns -1 because there is no such ancestor
        // System.out.println(res);
    }
}
