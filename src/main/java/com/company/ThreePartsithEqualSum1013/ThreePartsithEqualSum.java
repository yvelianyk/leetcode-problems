package com.company.ThreePartsithEqualSum1013;

import java.util.Arrays;

public class ThreePartsithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = Arrays.stream(A).sum();
        if(sum % 3 != 0) return false;

        int partSum = 0;
        for (int elem : A) {
            partSum += elem;
            if (partSum == sum / 3) partSum = 0;
        }
        return partSum == 0;
    }

    // STRAIGHT FORWARD
//    public boolean canThreePartsEqualSum(int[] A) {
//        boolean result = false;
//        int firstSum = 0;
//        int j;
//
//        for(int i = 0; i < A.length; i++) {
//            firstSum += A[i];
//            int secondSum = 0;
//            j = i + 1;
//            boolean firstPartFounded = false;
//            for (; j < A.length; j++) {
//                secondSum += A[j];
//                if (firstSum == secondSum) {
//                  firstPartFounded = true;
//                  break;
//                }
//            }
//
//            if(firstPartFounded) {
//                int thirdSum = 0;
//                for(int k = j + 1; k < A.length; k++) thirdSum += A[k];
//                if(secondSum == thirdSum) return true;
//            }
//
//        }
//
//        return result;
//    }


}
