package com.company.Contest176;

import java.util.ArrayList;
import java.util.List;

public class ProductOfNumbers {
    private List<Integer> list;
    private boolean isEqual;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        isEqual = true;
    }

    public void add(int num) {
        list.add(num);
        if (list.size() > 1) {
            if(!list.get(list.size() - 1).equals(list.get(list.size() - 2))) {
                isEqual = false;
            }
        }
    }

    public int getProduct(int k) {
        int lastIndex = list.size() - 1;
        int product = 1;
        if (isEqual) {
            if (list.get(0) == 0) return 0;
            if (list.get(0) == 1) return 1;

            return (int) Math.pow(list.get(0), k);
        }
        for (int i = lastIndex; i > lastIndex - k; i--) {
             product *= list.get(i);
        }
        return product;
    }
}
