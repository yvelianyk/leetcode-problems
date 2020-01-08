package com.company;


import com.company.MockInterviews.AmazonMockInterviews.Mock01082020.Problem2;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem2 solution = new Problem2();

        List<Integer> result = solution.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(result);

    }
}
