package com.company.ThirtyDayChellenge;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int[] finalShift = processShifts(shift);
        if (finalShift[0] == -1) return s;
        if (finalShift[0] == 0) return shiftLeft(s, finalShift[1]);
        return shiftRight(s, finalShift[1]);
    }

    private String shiftLeft(String s, int number) {
        int num = number % s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = num; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < num; i++) {
            sb.append(s.charAt(i));
        }
        return new String(sb);
    }

    private String shiftRight(String s, int number) {
        int num = number % s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i > s.length() - 1 - num; i--) {
            sb.append(s.charAt(i));
        }
        sb.reverse();
        for (int i = 0; i <= s.length() - 1 - num; i++) {
            sb.append(s.charAt(i));
        }
        return new String(sb);
    }

    private int[] processShifts(int[][] shift) {
        int total = 0;
        for (int[] ints : shift) {
            if (ints[0] == 1) total += ints[1];
            else total -= ints[1];
        }

        if (total == 0) return new int[-1];
        if (total < 0) return new int[]{0, Math.abs(total)};
        return new int[]{1, total};
    }
}
