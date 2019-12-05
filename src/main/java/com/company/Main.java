package com.company;

import com.company.BaseballGame682.BaseballGame;
import com.company.Contest165.Contest165Problem1;
import com.company.Contest165.Contest165Problem2;
import com.company.LetterCasePermutation784.LetterCasePermutation;
import com.company.LonelyPixelI531.LonelyPixel;
import com.company.ReorderDataInLogFiles937.ReorderDataInLogFiles;
import com.company.RotateString796.RotateString;
import com.company.SumDigitstheMinimumNumber1085.SumDigitstheMinimumNumber;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ReorderDataInLogFiles solution = new ReorderDataInLogFiles();

        String[] result = solution.reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});

        System.out.println(result);

    }
}
