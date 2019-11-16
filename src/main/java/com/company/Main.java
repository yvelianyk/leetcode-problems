package com.company;

import com.company.contest13.Contest13Task1;
import com.company.contest13.Contest13Task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Contest13Task2 solution = new Contest13Task2();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();

        list1.add("Earth");
        list1.add("North America");
        list1.add("South America");

        // "North America","United States","Canada"
        list2.add("North America");
        list2.add("United States");
        list2.add("Canada");

        //["United States","New York","Boston"
        list3.add("United States");
        list3.add("New York");
        list3.add("Boston");

        // ["Canada","Ontario","Quebec"]
        list4.add("Canada");
        list4.add("Ontario");
        list4.add("Quebec");

        // ["South America","Brazil"]
        list5.add("South America");
        list5.add("Brazil");

        List<List<String>> params = new ArrayList<>();
        params.add(list1);
        params.add(list2);
        params.add(list3);
        params.add(list4);
        params.add(list5);
        String result = solution.findSmallestRegion(params, "Quebec", "New York");

        System.out.println(result);

    }
}
