package com.company.Contest183;

public class Problem2 {
    public int numSteps(String s) {
        int count = 0;
        while (!isOne(s)) {
            count++;
            if(isOdd(s)) {
                s = binaryAddition(s, "1");
            } else {
                s = divide(s);
            }
        }
        return count;
    }

    private String binaryAddition(String s1, String s2) {
        if (s1 == null || s2 == null) return "";
        int first = s1.length() - 1;
        int second = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (first >= 0 || second >= 0) {
            int sum = carry;
            if (first >= 0) {
                sum += s1.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += s2.charAt(second) - '0';
                second--;
            }
            carry = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (carry > 0)
            sb.append('1');

        sb.reverse();
        return String.valueOf(sb);
    }

    private boolean isOne(String s) {
        int count = 0;
        boolean isLast = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == '1') {
                if (i == chars.length - 1) {
                    isLast = true;
                }
                count++;
            }
        }
        return isLast && count == 1;
    }

    private boolean isOdd (String s) {
        return s.charAt(s.length() - 1) == '1';
    }
    private String divide(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for (int i = 0; i < chars.length - 1; i++) {
            char aChar = chars[i];
            sb.append(aChar);
        }
        return new String(sb);
    }
}
