package com.company;

import com.company.StringToInteger8.StringToInteger;
import com.company.WordLadderII126.WordLadderII;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WordLadderII solution = new WordLadderII();
        List<String> list = new ArrayList<>();
        list.add("hot");
        list.add("lit");
        list.add("lot");
        list.add("lid");
        list.add("lod");

        List<List<String>> result = solution.findLadders("hit", "lod", list);


        System.out.println(result);
    }
}
