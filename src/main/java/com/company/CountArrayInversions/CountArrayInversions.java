package com.company.CountArrayInversions;

import java.util.ArrayList;
import java.util.List;

public class CountArrayInversions {
    public ResultOfSC sortAndCount(List<Integer> array) {
        int size = array.size();
        if (size == 1) return new ResultOfSC(array, 0);
        int mid = size / 2;

        ResultOfSC leftCount = sortAndCount(array.subList(0, mid));
        ResultOfSC rightCount = sortAndCount(array.subList(mid, size));

        List<Integer> resultSortedArray = new ArrayList<>();
        int range = size - mid;
        int iLeft = 0;
        int iRight = 0;
        long inversions = leftCount.count + rightCount.count;
        for(int i = 0; i < size; i++) {
            if(
                    iLeft < mid
                            && (
                            iRight >= range ||
                                    leftCount.sortedList.get(iLeft) <= rightCount.sortedList.get(iRight)
                    )
            ) {
                resultSortedArray.add(leftCount.sortedList.get(iLeft));
                iLeft++;
                inversions += iRight;
            }
            else if(iRight < range) {
                resultSortedArray.add(rightCount.sortedList.get(iRight));
                iRight++;
            }
        }
        return new ResultOfSC(resultSortedArray, inversions);
    }

}
