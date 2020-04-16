package com.company;

import com.company.MockInterviews.GMockInterviews.Mock14042020.Problem2;
import com.company.ThirtyDayChellenge.PerformStringShifts;
import com.company.ThirtyDayChellenge.ValidParenthesisString;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        Problem2 solution = new Problem2();
//        int result = solution.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");

        ValidParenthesisString solution = new ValidParenthesisString();
        boolean result = solution.checkValidString("((()()()))"); //
        System.out.println(result);
    }
}
