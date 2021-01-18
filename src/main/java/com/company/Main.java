package com.company;

import com.company.Challenges.CountSortedVowelStrings;
import com.company.Challenges.MaxInGeneratedArray;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CountSortedVowelStrings solution = new CountSortedVowelStrings();

        int res = solution.countVowelStrings(33);
        System.out.println(res);
    }
}
