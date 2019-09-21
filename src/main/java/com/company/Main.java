package com.company;

import com.company.WordBreak139.WordBreak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WordBreak solution = new WordBreak();
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaaa");
        boolean result = solution.wordBreak("aaaaaaa", list);
        System.out.println("RESULT: " + result);
    }
}
