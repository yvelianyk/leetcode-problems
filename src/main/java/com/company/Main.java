package com.company;

import com.company.BContest40.FrontMiddleBackQueue;
import com.company.BContest40.Problem2;
import com.company.LinkedListCycleII142.ListNode;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FrontMiddleBackQueue q = new FrontMiddleBackQueue();
        // q.pushFront(1);   // [1]
        // q.pushBack(2);    // [1, 2]
        q.pushMiddle(3);  // [1, 3, 2]
        q.pushMiddle(4);  // [1, 4, 3, 2]
        q.pushMiddle(5);  // [1, 4, 3, 2]
        // int res1 = q.popFront();     // return 1 -> [4, 3, 2]
        int res2 = q.popMiddle();    // return 3 -> [4, 2]
        int res3 = q.popMiddle();    // return 4 -> [2]
        int res4 = q.popMiddle();    // return 4 -> [2]
        // int res4 = q.popBack();      // return 2 -> []
        // int res5 = q.popFront();     // return -1 -> [] (The queue is empty)    }
        System.out.println(res2);
    }
}
