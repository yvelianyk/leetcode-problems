package com.company;



import com.company.TimeToInformAllEmployees1376.TimeToInformAllEmployees;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TimeToInformAllEmployees solution = new TimeToInformAllEmployees();

        // 4
        //[[4,3],[1,4],[4,6],[1,7]]
        int result = solution.numOfMinutes(6, 2, new int[]{2,2,-1,2,2,2}, new int[]{0,0,1,0,0,0});
        System.out.println(result);
    }
}
