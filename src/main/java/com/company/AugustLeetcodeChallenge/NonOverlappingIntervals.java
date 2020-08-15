package com.company.AugustLeetcodeChallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

// Such kind of problems are a little bit hard for me
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        LinkedList<int[]> removed = new LinkedList<>();
        for (int[] interval : intervals) {
            if (removed.size() == 0) {
                removed.add(interval);
            } else {
                if (interval[0] >= removed.getLast()[1]) {
                    removed.add(interval);
                }
            }
        }

        return intervals.length - removed.size();
    }

    private static class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            return a[1] - b[1];
        }
    }

}
