package com.company.BContest26;

import java.util.Map;

public class Problem1 {
    public int maxPower(String s) {
        int left = 0;
        int rigth = 0;
        char[] chars = s.toCharArray();
        int result = 0;
        int max = 0;
        while (rigth < chars.length) {
            char leftC = chars[left];
            char rightC = chars[rigth];
            if (leftC == rightC) {
               result++;
               max = Math.max(max, result);
               rigth++;
            } else {
                left = rigth;
                result = 0;
            }
        }
        return max;
    }
}
