package com.company.CountVowelsPermutation1220;

import java.util.Arrays;

public class CountVowelsPermutation {
    private final char[] vowels = new char[]{'#','a', 'e', 'i', 'o', 'u'};
    private final int MOD = 1_000_000_007;
    private int length;
    private int[][] memo;

    public int countVowelPermutation(int n) {
        length = n;
        memo = new int[n + 1][6];
        for (int[] ints : memo) Arrays.fill(ints, -1);
        return count(0, 0);
    }

    private int count(int index, int previous) {
        if (index == length) return 1;
        if (memo[index][previous] != -1) return memo[index][previous];

        long result = 0;
        for (int i = 1; i < vowels.length; i++) {
            char vowel = vowels[i];
            switch (vowels[previous]) {
                case 'a':
                    if (vowel == 'e') result = (result + count(index + 1, i)) % MOD;
                    break;
                case 'e':
                    if (vowel == 'a' || vowel == 'i')
                        result = (result + count(index + 1, i)) % MOD;
                    break;
                case 'i':
                    if (vowel != 'i') result = (result + count(index + 1, i)) % MOD;
                    break;
                case 'o':
                    if (vowel == 'i' || vowel == 'u')
                        result = (result + count(index + 1, i)) % MOD;
                    break;
                case 'u':
                    if (vowel == 'a') result = (result + count(index + 1, i)) % MOD;
                    break;
                default:
                    result = (result + count(index + 1, i)) % MOD;
            }
        }

        memo[index][previous] = (int) result;
        return memo[index][previous];
    }
}
