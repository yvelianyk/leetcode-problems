package com.company;

import com.company.WordSearch76.WordSearchA2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WordSearchA2 solution = new WordSearchA2();

        // [1,3],[1,4],[2,3],[2,4],[4,3]
        boolean result = solution.exist(new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'},
        },"ABCCCED");
        System.out.println(result);
    }
}
