package com.company;

import com.company.SequentialDigits1291.SequentialDigits;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        SequentialDigits solution = new SequentialDigits();

        List<Integer> result = solution.sequentialDigits(1000, 13000);

        System.out.println(result);

    }
}
