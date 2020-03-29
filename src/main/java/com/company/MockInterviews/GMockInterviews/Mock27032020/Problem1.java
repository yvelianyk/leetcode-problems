package com.company.MockInterviews.GMockInterviews.Mock27032020;

public class Problem1 {
    private int maxMinutes;

    public String largestTimeFromDigits(int[] A) {
        maxMinutes = -1;
        backtrack(0, A);
        if (maxMinutes == -1) return "";
        return String.format("%02d:%02d", maxMinutes / 60, maxMinutes % 60);
    }

    private void backtrack(int start, int[] A) {
        if (start == A.length) {
            int minutes = toMinutes(A);
            if (minutes != -1) maxMinutes = Math.max(maxMinutes, minutes);
        }

        for (int i = start; i < A.length; i++) {
            swap(start, i, A);
            backtrack(start + 1, A);
            swap(i, start, A);
        }
    }

    private void swap(int i, int j, int[] A) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private int toMinutes(int[] A) {
        int hours = A[0] * 10 + A[1];
        if (hours > 23) return -1;
        int minutes = A[2] * 10 + A[3];
        if (minutes > 59) return -1;
        return hours * 60 + minutes;
    }
}
