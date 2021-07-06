package com.company.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BeautifulArrangements {
    int result;
    List<Integer> list = new ArrayList<>();

    public int countArrangement(int n) {
        this.result = 0;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        permute(0);
        return result;
    }

    private void permute(int index) {
        if (index == list.size()) {
            result++;
            return;
        }

        for (int i = index; i < list.size(); i++) {
            swap(index, i);
            int number = list.get(index);
            boolean atLeastOneCondition = ((index + 1) % number == 0) || (number % (index + 1) == 0);
            if (atLeastOneCondition) {
                permute(index + 1);
            }
            swap(i, index);
        }
    }

    private void swap(int left, int right) {
        int temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);
    }
}
