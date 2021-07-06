package com.company.ArrayTransformation1243;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayTransformation {
    public List<Integer> transformArray(int[] arr) {
        boolean isIterate = true;


        while (isIterate) {
            int[] newArr = arr.clone();
            isIterate = false;
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                    isIterate = true;
                    newArr[i] = newArr[i] + 1;
                } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    isIterate = true;
                    newArr[i] = newArr[i] - 1;
                }
            }
            arr = newArr;
        }

        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
