package com.company.Challenges;

import java.util.*;

public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        LinkedList<int[]> merged = new LinkedList<>();
        merged.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            int[] prev = merged.getLast();
            if (interval[0] < prev[0] || interval[1] > prev[1]) {
                merged.add(interval);
            }
        }
        return merged.size();
    }


    private class IntervalComparator implements Comparator<int[]> {
        @Override
        public int compare(int[] a, int[] b) {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        }
    }

}
