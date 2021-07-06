package com.company.FibonacciNumber509;

public class FibonacciNumber {

    public int fib(int N) {
        int[] cache = new int[N];
        return N < 2 ?
                N :
                fibCached(N - 1, cache) + fibCached(N - 2, cache);
    }

    private int fibCached(int N, int[] cache) {
        if(cache[N] != 0) return cache[N];
        if (N < 2) return N;
        int value = fibCached(N - 1, cache) + fibCached(N - 2, cache);
        cache[N] = value;
        return value;
    }
}
