package com.company.DecodeString394;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Map<String, String> map = new HashMap();
        map.put("[", "]");

        char[] array = s.toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            if (Character.isDigit(array[i])) continue;
            String c = Character.toString(array[i]);
            if (map.containsKey(c)) {
                String closeBracket = map.get(c);
                StringBuilder sb = new StringBuilder();
                StringBuilder resultSb = new StringBuilder();

                int number = getNumber(array, i);

                String current = stack.pop();
                while (!current.equals(closeBracket)) {
                    sb.append(current);
                    current = stack.pop();
                }

                for (int j = 0; j < number; j++) resultSb.append(sb.toString());

                stack.push(resultSb.toString());
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) result.append(stack.pop());

        return result.toString();

    }

    private int getNumber(char[] array, int i) {
        StringBuilder numberSb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (i > 0 && Character.isDigit(array[--i])) stack.push(array[i]);
        while (!stack.isEmpty()) numberSb.append(stack.pop());
        return Integer.parseInt(numberSb.toString());
    }
}

