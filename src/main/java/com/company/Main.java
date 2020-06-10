package com.company;

import com.company.JuneLeetcodeChallenge.IsSubsequence;
import com.company.JuneLeetcodeChallenge.SearchInsertPosition;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SearchInsertPosition solution = new SearchInsertPosition();

        int result = solution.searchInsert(new int[]{1,3,5,6}, 0);
        System.out.println(result);
    }
}
