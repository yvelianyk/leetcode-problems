package com.company.BContest24;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public int findMinFibonacciNumbers(int k) {
        int count = 0;
        while (k != 0) {
            int close = closest(k);
            if (k > 0) k = k - close;
            count++;
        }

        return count;
    }


    private int closest(int num) {
        if (num < 1)
            return 0;
        else if (num == 1)
            return 1;
        else {
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(1);
            while (true)
            {
                int index = list.size();
                list.add(list.get(index - 1) + list.get(index - 2));
                if (list.get(list.size() - 1) > num) break;
            }
            return list.get(list.size() - 2);
        }
    }
}
