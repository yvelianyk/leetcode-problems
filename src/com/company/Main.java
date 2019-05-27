package com.company;

import com.company.MergeSort912.MergeSort;
import com.company.QuickSort.QuickSort;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{3,9,10,4,8};
        QuickSort solution = new QuickSort();
        int[] result = solution.sortArray(array);
        System.out.println("RESULT: " + result);
    }
}
