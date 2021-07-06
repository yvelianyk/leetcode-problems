package com.company.FindSmallestLetterGreaterThanTarget744;

public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target >= letters[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return letters[left % letters.length];
    }
}
