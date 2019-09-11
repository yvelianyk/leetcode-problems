package com.company.GuessNumberHigherorLower374;

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left)/2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            if (guess == -1) right = mid - 1;
            if (guess == 1) left = mid + 1;
        }
        return -1;
    }

    // MOCK METHOD: see description in the task
    private int guess(int x) {
        return 0;
    }
}
