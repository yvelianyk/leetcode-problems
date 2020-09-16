package com.company;

import com.company.AugustLeetcodeChallenge.WordPattern;
import com.company.BContest34.Problem2;
import com.company.Contest206.Problem4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem4 solution = new Problem4();

        // boolean res = solution.isTransformable("848188","818884");
        boolean res = solution.isTransformable("34521","23415");
        // boolean res = solution.isTransformable("84532","34852");
        // boolean res = solution.isTransformable("4941","1494");
        // boolean res = solution.isTransformable("5894","4985");
        System.out.println(res);
    }
}
