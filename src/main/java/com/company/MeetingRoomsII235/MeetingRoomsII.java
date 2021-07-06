package com.company.MeetingRoomsII235;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return 0;
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < intervals.length; i++) {
            int[] ints = intervals[i];
            starts[i] = ints[0];
            ends[i] = ints[1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);
        int start = 0;
        int end = 0;
        int counter = 0;
        while (start < starts.length) {
            int startElem = starts[start];
            int endElem = ends[end];
            if(startElem < endElem) {
                counter++;
            } else {
                end++;
            }
            start++;
        }
        return counter;
    }
}
