package com.company;

import com.company.BContest20.Cashier;
import com.company.BContest20.Problem1;
import com.company.BContest20.Problem3;
import com.company.InsertionSort.InsertionSort;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        InsertionSort solution = new InsertionSort();
        List<Integer> sorted = solution.sortArray(new int[]{3,2,5,1,4});
        System.out.println(sorted);
    }
}
