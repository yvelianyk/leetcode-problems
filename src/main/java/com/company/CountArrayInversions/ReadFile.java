package com.company.CountArrayInversions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<Integer> read() throws IOException {
        InputStream is = new FileInputStream("/home/yvelianyk/Learning/leetcode-problems/src/main/java/com/company/CountArrayInversions/IntegerArray.txt");
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = buf.readLine();
        List<Integer> list = new ArrayList<>();

        while (line != null) {
            list.add(Integer.parseInt(line));
            line = buf.readLine();
        }

        return list;
    }

}
