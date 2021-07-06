package com.company.Challenges;

public class MinimumDeletions {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();
        int a = 0;
        for (char c : chars) if (c == 'a') a++;
        int leftB = 0;
        int rightA = a;
        int best = rightA;
        for (char aChar : chars) {
            best = Math.min(best, leftB + rightA);
            if (aChar == 'a') {
                rightA--;
            } else {
                leftB++;
            }
        }
        best = Math.min(best, leftB + rightA);
        return best;
    }
}
