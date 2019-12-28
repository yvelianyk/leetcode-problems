package com.company.MockInterviews.AmazonMockInterviews.Mock12272019;

// https://leetcode.com/problems/reverse-string-ii/
public class Problem1 {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0, counter = 0; i < s.length(); i = i + k, counter++) {
            String substr;
            if (i + k >= s.length()) {
                substr = s.substring(i);
            } else {
                substr = s.substring(i, i + k);
            }

            if(counter % 2 == 0) {
                sb.append(new StringBuilder(substr).reverse());
            } else {
                sb.append(substr);
            }

        }

        if(sb.length() < s.length()) {
            sb.append(s.substring(sb.length()));
        }
        return new String(sb);
    }
}
