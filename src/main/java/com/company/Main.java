package com.company;

import com.company.BaseballGame682.BaseballGame;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BaseballGame solution = new BaseballGame();

        int result = solution.calPoints(new String[]{"5","-2","4","C","D","9","+","+"});

        System.out.println(result);

    }
}
