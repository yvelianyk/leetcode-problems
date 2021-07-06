package com.company.Contest170;

//TODO: Could be improved by using prefix XOR
public class Problem2 {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = getXor(queries[i], arr);
        }
        return result;
    }

    private int getXor(int[] query, int[] arr) {
        int result = arr[query[0]];

        for (int i = query[0] + 1; i <= query[1]; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
