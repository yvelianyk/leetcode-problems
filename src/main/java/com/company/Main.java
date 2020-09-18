package com.company;

import com.company.AugustLeetcodeChallenge.RobotCycle;
import com.company.AugustLeetcodeChallenge.WordPattern;
import com.company.BContest34.Problem2;
import com.company.Contest206.Problem3;
import com.company.Contest206.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RobotCycle solution = new RobotCycle();

        // boolean res = solution.isTransformable("848188","818884");
        boolean res = solution.isRobotBounded("GLRLLGLL");
        // boolean res = solution.isTransformable("84532","34852");
        // boolean res = solution.isTransformable("4941","1494");
        // boolean res = solution.isTransformable("5894","4985");
        System.out.println(res);
    }
}
