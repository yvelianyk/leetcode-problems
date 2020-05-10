package com.company.Contest188;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public List<String> buildArray(int[] target, int n) {
        int list = 0;
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n && list < target.length; i++) {
            int targ = target[list];
            if (targ == i) {
                result.add("Push");
                list++;
            } else {
                int diff = targ - i;
                int j = 0;
                for (; j < diff; j++) {
                    result.add("Push");
                    result.add("Pop");
                }
                i = i + j - 1;
            }

        }
        return result;
    }
}
