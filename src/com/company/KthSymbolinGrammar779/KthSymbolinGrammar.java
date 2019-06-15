package com.company.KthSymbolinGrammar779;

public class KthSymbolinGrammar {

    // MEMORY LIMIT EXCEEDED BUT CLEAR:
    public int kthGrammar(int N, int K) {
        char[] row = findRow(N);
        char res = row[K-1];
        return Integer.parseInt(Character.toString(res));
    }

    private char[] findRow(int N) {
        if (N == 1) return new char[]{'0'};

        char[] row = findRow(N - 1);
        return concat(row, reverse(row));
    }

    private char[] reverse(char[] chars) {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i] == '0' ? '1' : '0';
        }
        return result;
    }

    private char[] concat(char[] a, char b[]) {
        char[] result = new char[a.length * 2];
        int i = 0;
        for (; i < a.length; i++) {
            result[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            char c = b[j];
            result[i++] = c;
        }

        return result;
    }
}
