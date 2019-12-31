package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Mock12272019.Problem2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // 6
    //[[0,1],[1,2],[2,0],[1,3],[3,4],[4,5],[5,3]]
    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(0);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(3);

        List<List<Integer>> forest = new ArrayList<>();
        forest.add(list1);
        forest.add(list2);
        forest.add(list3);
        forest.add(list4);


        List<List<Integer>> result = solution.criticalConnections(4, forest);
        System.out.println(result);

    }
}
