package com.company;

import com.company.MockInterviews.GMockInterviews.Mock14042020.Problem2;
import com.company.ThirtyDayChellenge.PerformStringShifts;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        Problem2 solution = new Problem2();
//        int result = solution.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");

        PerformStringShifts solution = new PerformStringShifts();
        String result = solution.stringShift("fgabcde", new int[][]{{0,2}});
        System.out.println(result);
    }
}
