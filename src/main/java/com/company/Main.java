package com.company;

import com.company.BurstBaloons312.BurstBaloons;
import com.company.Contest193.Problem2;
import com.company.Contest193.Problem3;
import com.company.Contest193.TreeAncestor;
import com.company.JuneLeetcodeChallenge.SurroundedRegions;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SurroundedRegions solution = new SurroundedRegions();
//        char[][] board = {
//                {'X', 'X', 'X', 'X'},
//                {'X', 'O', 'O', 'X'},
//                {'X', 'X', 'O', 'X'},
//                {'X', 'O', 'X', 'X'},
//        };
        char[][] board = {
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'X'},
        };
//        char[][] board = {
//                {'O', 'X', 'O', 'O', 'O', 'X'},
//                {'O', 'O', 'X', 'X', 'X', 'O'},
//                {'X', 'X', 'X', 'X', 'X', 'O'},
//                {'O', 'O', 'O', 'O', 'X', 'X'},
//                {'X', 'X', 'O', 'O', 'X', 'O'},
//                {'O', 'O', 'X', 'X', 'X', 'X'},
//        };

        //[
        // ["O","X","O","O","O","X"],
        // ["O","O","X","X","X","O"],
        // ["X","X","X","X","X","O"],
        // ["O","O","O","O","X","X"],
        // ["X","X","O","O","X","O"],
        // ["O","O","X","X","X","X"]
        // ]

        // [
        // ["O","X","O","O","O","X"],
        // ["O","O","X","X","X","O"],
        // ["X","X","X","X","X","O"],
        // ["O","O","X","X","X","X"],
        // ["X","X","X","X","X","O"],
        // ["O","O","X","X","X","X"]]

        // [
        // ["O","X","O","O","O","X"],
        // ["O","O","X","X","X","O"],
        // ["X","X","X","X","X","O"],
        // ["O","O","O","O","X","X"],
        // ["X","X","O","O","X","O"],
        // ["O","O","X","X","X","X"]]


        solution.solve(board);
        System.out.println(board);
    }
}
