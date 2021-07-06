package com.company.BContest40;

public class Problem1 {
    public int maxRepeating(String sequence, String word) {
        int length = word.length();
        int seqLength = sequence.length();
        char[] chars = sequence.toCharArray();
        int finalRes = 0;
        for (int i = 0; i < chars.length; i++) {
            int next = i;
            int result = 0;
            if (i + length > seqLength) break;
            String sub = sequence.substring(i, i + length);
            if (sub.equals(word)) {
                while (next < seqLength) {
                    if (next + length > seqLength) break;
                    String sub1 = sequence.substring(next, next + length);
                    if (sub1.equals(word)) {
                        next = next + length;
                        result++;
                    } else {
                        break;
                    }
                }
                finalRes = Math.max(finalRes, result);
            }
        }

        return finalRes;
    }
}
