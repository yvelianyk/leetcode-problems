package com.company;

import com.company.BaseballGame682.BaseballGame;
import com.company.Contest165.Contest165Problem1;
import com.company.Contest165.Contest165Problem2;
import com.company.LetterCasePermutation784.LetterCasePermutation;
import com.company.LonelyPixelI531.LonelyPixel;
import com.company.RotateString796.RotateString;
import com.company.SumDigitstheMinimumNumber1085.SumDigitstheMinimumNumber;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        LonelyPixel solution = new LonelyPixel();

        int result = solution.findLonelyPixel(new char[][]{
                {'W', 'W', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'B'}
        });

        System.out.println(result);

    }
}
