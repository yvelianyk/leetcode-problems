package com.company.Contest204;

public class Problem2 {
    // 2 PASSES
//    public int getMaxLen(int[] nums) {
//        int negCounter = 0;
//        int maxLength = 0;
//        int startIndex = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//            if (num < 0) {
//                negCounter++;
//                if (negCounter % 2 == 0)
//                    maxLength = Math.max(maxLength, i - startIndex + 1);
//            }
//            if (num > 0) {
//                maxLength = Math.max(maxLength,negCounter % 2 == 0 ? i - startIndex + 1 : 1);
//            }
//            if (num == 0 && i <= nums.length - 1) {
//                startIndex = i + 1;
//                negCounter = 0;
//            }
//        }
//
//        negCounter = 0;
//        startIndex = nums.length - 1;
//        for (int i = startIndex; i >= 0; i--) {
//            int num = nums[i];
//            if (num < 0) {
//                negCounter++;
//                if (negCounter % 2 == 0)
//                    maxLength = Math.max(maxLength, Math.abs(i - startIndex) + 1);
//            }
//            if (num > 0) {
//                maxLength = Math.max(maxLength,negCounter % 2 == 0 ? Math.abs(i - startIndex) + 1 : 1);
//            }
//            if (num == 0 && i > 0 ) {
//                startIndex = i - 1;
//                negCounter = 0;
//            }
//        }
//
//        return maxLength;
//    }

    // 1 pass
    public int getMaxLen(int[] nums) {
        int negCounter = 0;
        int maxLength = 0;
        int startIndex = 0;
        int firstNegative = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                if (firstNegative == -1) firstNegative = i;
                negCounter++;
                int res = negCounter % 2 == 0 ?  i - startIndex + 1 : i - firstNegative;
                maxLength = Math.max(maxLength, res);
            } else if (num > 0) {
                int res = negCounter % 2 == 0 ? i - startIndex + 1 : Math.max(i - firstNegative, 1);
                maxLength = Math.max(maxLength, res);
            } else if (i <= nums.length - 1) {
                startIndex = i + 1;
                negCounter = 0;
                firstNegative = -1;
            }
        }

        return maxLength;
    }
}
