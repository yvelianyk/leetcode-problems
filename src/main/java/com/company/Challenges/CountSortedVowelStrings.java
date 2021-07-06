package com.company.Challenges;

// TODO: could be added memoization
public class CountSortedVowelStrings {
    private final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public int countVowelStrings(int n) {
        return count('z', 0, n);
    }

    private int count(char prev, int index, int n) {
        if (index == n) return 1;
        int result = 0;
        int vowelIndex = getVowelIndex(prev);
        for (int i = vowelIndex; i < vowels.length; i++) {
            char vowel = vowels[i];
            result += count(vowel, index + 1, n);
        }
        return result;
    }

    private int getVowelIndex(char ch) {
        if (ch == 'a') return 0;
        if (ch == 'e') return 1;
        if (ch == 'i') return 2;
        if (ch == 'o') return 3;
        if (ch == 'u') return 4;
        return 0;
    }
}
