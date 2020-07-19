package com.company;

import com.company.CourseScheduleII210.CourseScheduleII;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CourseScheduleII solution = new CourseScheduleII();

        int[][] edges = new int[][] {
                {0,1},
                {1,0},
        };
        int[] result = solution.findOrder(3, edges);
        System.out.println(result);
    }
}
