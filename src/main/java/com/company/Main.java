package com.company;

import com.company.Challenges.ScoreOfParentheses;
import com.company.Contest229.Problem1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ScoreOfParentheses solution = new ScoreOfParentheses();

        int result = solution.scoreOfParentheses("(())" );

        System.out.println(result);
    }
}
