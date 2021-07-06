package com.company.Contest179;

public class Problem1 {
    public String generateTheString(int n) {
        if (n == 1) return "a";
        int N = n;
        StringBuilder sb = new StringBuilder();

        while (n > 1) {
            sb.append("a");
            n--;
        }
        if (N % 2 == 0) sb.append("b");
        else sb.append("a");
        return new String(sb);
    }
}
