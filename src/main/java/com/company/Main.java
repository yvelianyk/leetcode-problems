package com.company;

import com.company.Challenges.FindLongestWord;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        FindLongestWord solution = new FindLongestWord();
        List<String> list = new ArrayList<>();

        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("plea");
//        list.add("a");
//        list.add("b");
//        list.add("c");

        String result = solution.findLongestWord("abpcplea", list);

        System.out.println(result);
    }
}
