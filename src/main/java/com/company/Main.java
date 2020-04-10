package com.company;

import com.company.Triangle120.Triangle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Triangle solution = new Triangle();

        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

        list1.add(2);

        list2.add(3);
        list2.add(4);

        list3.add(6);
        list3.add(5);
        list3.add(7);

        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        triangle.add(list1);
        triangle.add(list2);
        triangle.add(list3);
        triangle.add(list4);

        int result = solution.minimumTotal(triangle);

        System.out.println(result);
    }
}
