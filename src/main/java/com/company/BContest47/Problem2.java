package com.company.BContest47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem2 {

    public boolean checkPowersOfThree(int n) {
        List<Integer> list = new ArrayList<>();
        if (n == 1) return true;
        int num = 3;
        while (num <= n) {
           list.add(num);
           num = num * 3;
        }
        int newNum = n;
        int index = list.size() - 1;
        while (newNum > 0 && index >= 0) {
            if (newNum - list.get(index) >= 0) {
                newNum = newNum - list.get(index);
            }
            if (newNum == 1) {
                newNum = 0;
            }
            index--;
        }
        return newNum == 0;
    }


}
