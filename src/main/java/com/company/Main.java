package com.company;

import com.company.GroupShiftedStrings249.GroupShiftedStrings;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GroupShiftedStrings solution = new GroupShiftedStrings();
        String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        List<List<String>> result = solution.groupStrings(strings);
        System.out.println(result);
    }
}
