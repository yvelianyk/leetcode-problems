package com.company;

import com.company.BContest47.Problem3;
import com.company.Challenges.ShortEncodingWords;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ShortEncodingWords solution = new ShortEncodingWords();

        int result = solution.minimumLengthEncoding(new String[]{"time", "me", "bell"});

        System.out.println(result);
    }
}
