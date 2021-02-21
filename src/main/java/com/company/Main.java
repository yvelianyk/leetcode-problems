package com.company;

import com.company.BContest46.Problem1;
import com.company.BContest46.Problem2;
import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Challenges.*;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

// [[-8490700],[-9218738],[-8142996,-2733527,-8835211,6591339]]
//[-8490700,-9218738,-8142996,-2733527,-8835211,6591339]
//        boolean res = solution.canChoose(new int[][]{{-8490700}, {-9218738}, {-8142996,-2733527,-8835211,6591339}}, new int[]{-8490700,-9218738,-8142996,-2733527,-8835211,6591339});

        boolean res = solution.canChoose(new int[][]{{352529,-4284030,6431387,2432677,-3305342,-4342915,-9007629,3195451,-9587228,5747770,8106556,-2385247,3207013,-8540809,9400364,6852329}, {9903943}}, new int[]{-8540809,5747770,2432677,-9587228,3195451,352529,-4284030,6431387,2432677,-3305342,-4342915,-9007629,3195451,-9587228,5747770,8106556,-2385247,3207013,-8540809,-8540809,6852329,-9007629,352529,9903943});

        System.out.println(res);
    }
}
