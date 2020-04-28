package com.company;


import com.company.Contest186.Problem1;
import com.company.Contest186.Problem2;
import com.company.Contest186.Problem4;
import com.company.Contest186.Problem4BottomUp;
import com.company.ThirtyDayChellenge.FirstUnique;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FirstUnique solution = new FirstUnique(new int[]{2,3,5});
        int first1 = solution.showFirstUnique();
        solution.add(5);
        int first2 = solution.showFirstUnique();
        solution.add(2);
        int first3 = solution.showFirstUnique();
        solution.add(3);
        int first4 = solution.showFirstUnique();
        System.out.println(first1);
    }
}
