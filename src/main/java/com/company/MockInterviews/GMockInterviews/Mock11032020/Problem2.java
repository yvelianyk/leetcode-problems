package com.company.MockInterviews.GMockInterviews.Mock11032020;

public class Problem2 {
    public int totalFruit(int[] tree) {
        int left = 0;
        int right = 0;
        int result = 0;
        int firstBucket = -1;
        int secondBucket = -1;

        while (right < tree.length) {
            int curr = tree[right];
            if (
                    firstBucket != -1 &&
                    firstBucket != curr &&
                    secondBucket != -1 &&
                    secondBucket != curr
            ) {
                left = left + 1;
                right = left;
                firstBucket = -1;
                secondBucket = -1;
                continue;
            }
            if (firstBucket == -1 && curr != secondBucket) firstBucket = curr;
            else if (secondBucket == -1 && curr != firstBucket) secondBucket = curr;
            result = Math.max(result, right - left + 1);
            right++;
        }

        return result;
    }
}
