package com.company;

import com.company.AccountsMerge721.AccountsMerge;
import com.company.TheEarliestMomentWhenEveryoneBecomeFriends1101.TheEarliestMomentWhenEveryoneBecomeFriends;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        AccountsMerge solution = new AccountsMerge();

        List<List<String>> input = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        list1.add("John");
        list1.add("johnsmith@mail.com");
        list1.add("john00@mail.com");

        list2.add("John");
        list2.add("johnnybravo@mail.com");

        list3.add("John");
        list3.add("johnsmith@mail.com");
        list3.add("john_newyork@mail.com");

        list4.add("Mary");
        list4.add("mary@mail.com");
        input.add(list1);
        input.add(list2);
        input.add(list3);
        input.add(list4);
        List<List<String>> result = solution.accountsMerge(input);
        System.out.println(result);

    }
}
