package com.company;

import com.company.BContest35.Problem1;
import com.company.BContest35.Problem2;
import com.company.Challenges.EvaluateDivision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        EvaluateDivision solution = new EvaluateDivision();

        List<List<String>> equations = new ArrayList<>();
        List<String> eq1 = new ArrayList<>();
        eq1.add("a");
        eq1.add("b");
//        List<String> eq2 = new ArrayList<>();
//        eq2.add("b");
//        eq2.add("c");
        equations.add(eq1);
        //equations.add(eq2);
        double[] values = new double[1];
        values[0] = 0.5;
        //values[1] = 3.0;

        List<List<String>> queries = new ArrayList<>();
        List<String> q1 = new ArrayList<>();
        q1.add("a");
        q1.add("b");
        List<String> q2 = new ArrayList<>();
        q2.add("b");
        q2.add("a");
        List<String> q3 = new ArrayList<>();
        q3.add("a");
        q3.add("c");
        List<String> q4 = new ArrayList<>();
        q4.add("x");
        q4.add("y");
//        List<String> q5 = new ArrayList<>();
//        q5.add("x");
//        q5.add("x");
//        queries.add(q1);
        queries.add(q2);
        queries.add(q3);
        queries.add(q4);
        //queries.add(q5);

        double[] res = solution.calcEquation(equations, values, queries);
        System.out.println(res);
    }
}
