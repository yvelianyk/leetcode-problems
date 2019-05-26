package com.company;

import com.company.FindMinimuminRotatedSortedArrayII154.FindMinimuminRotatedSortedArrayII;
import com.company.IntersectionofTwoArrays349.IntersectionofTwoArrays;

public class Main {

    public static void main(String[] args) {
        IntersectionofTwoArrays solution = new IntersectionofTwoArrays();
        int[] array = new int[]{1,2,2,1};
        int[] array2 = new int[]{2,2};
        int[] result = solution.intersection(array, array2);
        System.out.println("RESUlt: " + result);
    }
}
