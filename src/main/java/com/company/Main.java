package com.company;

import com.company.MockInterviews.AmazonMockInterviews.Mock12262019.Problem1;
import com.company.MockInterviews.AmazonMockInterviews.Mock12262019.Problem2;
import com.company.XKindDeckofCards914.XKindDeckofCards;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(0);
        list2.add(5);

        List<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(7);
        list3.add(6);

        List<List<Integer>> forest = new ArrayList<>();
        forest.add(list1);
        forest.add(list2);
        forest.add(list3);
        int result = solution.cutOffTree(forest);

        System.out.println(result);

    }
}
