package com.company.Challenges;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        return traverse(arr, 0, true, false);
    }

    private boolean traverse(int[] arr, int index, boolean isUp, boolean wasFlip) {
        if (index == arr.length - 1) return wasFlip;
        int next = arr[index + 1];
        int curr = arr[index];
        if (next == curr) return false;
        if (isUp) {
            if (next < curr) {
                if (index == 0 || wasFlip) return false;
                wasFlip = true;
                isUp = false;
            }
        } else if (curr <= next) return false;
        return traverse(arr,index + 1, isUp, wasFlip);
    }
}
