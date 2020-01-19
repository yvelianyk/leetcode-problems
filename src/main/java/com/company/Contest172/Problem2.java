package com.company.Contest172;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public List<String> printVertically(String s) {
        String[] arrOfStr = s.split("\\s");
        List<String> result = new ArrayList<>();
        int max = 0;
        for (String s1 : arrOfStr) {
            max = Math.max(max, s1.length());
        }

        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String str : arrOfStr) {
                if (i < str.length()) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            String regex = "\\s+$";
            String resStr = new String(sb);

            result.add(resStr.replaceAll(regex, ""));
        }

        return result;
    }
}
