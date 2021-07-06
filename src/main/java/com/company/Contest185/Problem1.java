package com.company.Contest185;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem1 {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if(Character.isDigit(ch)) digits.add(ch);
             else letters.add(ch);
        }

        if(Math.abs(letters.size() - digits.size()) > 1) return "";
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int rigth = 0;
        if(letters.size() > digits.size()) {
            for (int i = 0; i < s.length(); i++) {
                if( i % 2 == 0) {
                    sb.append(letters.get(left++));
                } else {
                    sb.append(digits.get(rigth++));
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if( i % 2 == 0) {
                    sb.append(digits.get(left++));
                } else {
                    sb.append(letters.get(rigth++));
                }
            }
        }
        return new String(sb);
    }
}
