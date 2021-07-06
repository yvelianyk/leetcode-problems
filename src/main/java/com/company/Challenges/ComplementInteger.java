package com.company.Challenges;

public class ComplementInteger {
    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        return total(bitCount(N) - 1) - N;
    }

    private int total(int bitCount) {
        int result = 0;
        while (bitCount >= 0) {
            result += (int) (Math.pow(2, bitCount--));
        }
        return result;
    }

    private int bitCount(int value) {
        int count = 0;
        while (value > 0) {
            count++;
            value = value >> 1;
        }
        return count;
    }
}
