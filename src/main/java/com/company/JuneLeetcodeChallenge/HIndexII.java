package com.company.JuneLeetcodeChallenge;

public class HIndexII {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        int left = 0;
        int right = citations.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int reverseIndex = citations.length - mid;
            int elem = citations[mid];
            if(elem == reverseIndex) return elem;
            if (elem < reverseIndex) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return citations.length - left;
    }

}
