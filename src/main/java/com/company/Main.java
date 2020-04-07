package com.company;

import com.company.TwoKeysKeyboard650.TwoKeysKeyboard;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TwoKeysKeyboard solution = new TwoKeysKeyboard();

        int result = solution.minSteps(3);

        System.out.println(result);
    }
}
