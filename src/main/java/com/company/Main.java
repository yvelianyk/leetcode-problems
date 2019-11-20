package com.company;

import com.company.CheckIfItIsaStraightLine1232.CheckIfItIsaStraightLine;
import com.company.RemoveSubfolders1233.RemoveSubfolders;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        RemoveSubfolders solution = new RemoveSubfolders();

        List<String > result = solution.removeSubfolders(new String[]{"/a/b/c","/a/b/ca","/a/b/d"});

        System.out.println(result);

    }
}
