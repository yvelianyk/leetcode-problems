package com.company;

import com.company.CountArrayInversions.CountArrayInversions;
import com.company.CountArrayInversions.ReadFile;
import com.company.CountArrayInversions.ResultOfSC;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        CountArrayInversions solution = new CountArrayInversions();
        ReadFile fileReader = new ReadFile();
        List<Integer> list = fileReader.read();

        ResultOfSC result = solution.sortAndCount(list);
        System.out.println("RESULT: " + result.count);
    }
}
