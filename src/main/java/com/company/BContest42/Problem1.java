package com.company.BContest42;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem1 {
    public int countStudents(int[] students, int[] sandwiches) {
        List<Integer> studentList = new ArrayList<>();
        Stack<Integer> sandwichesStack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            int sandwich = sandwiches[i];
            sandwichesStack.push(sandwich);
        }
        for (int student : students) {
            studentList.add(student);
        }
        int loopCount = 0;
        while (!sandwichesStack.empty()) {
            if (studentList.get(0).equals(sandwichesStack.peek())) {
                sandwichesStack.pop();
                studentList.remove(0);

                loopCount = 0;
            } else {
                swap(studentList);
                loopCount++;
            }
            if (loopCount > studentList.size()) {
                return studentList.size();
            }

        }
        return studentList.size();

    }

    private void swap(List<Integer> studentList) {
        int size = studentList.size();
        int temp = studentList.get(0);
        studentList.remove(0);
        studentList.add(temp);
    }
}
