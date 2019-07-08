package com.company.CountPrimes204;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];

        for (int i = 2; i < primes.length; i++) primes[i] = true;

        for(int p = 2; p * p <= n - 1; p++) {
            if(primes[p]) {
                for(int k = p * p; k<=n - 1; k = k + p) {
                    primes[k] = false;
                }
            }
        }

        int counter = 0;
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]) counter++;
        }
        return counter;

    }
}
