package com.company.MergeIntervals56;

import com.company.LinkedListCycleII142.ListNode;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        LinkedList<int[]> merged = new LinkedList<>();

        for (int[] interval : intervals) {
            if(merged.size() == 0 || interval[0] > merged.getLast()[1]) {
                merged.add(interval);
            } else {
                if (merged.getLast()[1] < interval[1]) {
                    merged.getLast()[1] = interval[1];
                }
            }
        }

        int[][] result = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }

        return result;
    }

    private class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return a[0] - b[0];
        }
    }
}
