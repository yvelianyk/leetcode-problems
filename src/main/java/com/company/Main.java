package com.company;

import com.company.XKindDeckofCards914.XKindDeckofCards;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        XKindDeckofCards solution = new XKindDeckofCards();

        boolean result = solution.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3});
        // boolean result = solution.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2});
        // boolean result = solution.hasGroupsSizeX(new int[]{1});
        // boolean result = solution.hasGroupsSizeX(new int[]{1,1,2,2,2,2});

        System.out.println(result);

    }
}
