package com.company;

import com.company.AccountsMerge721.AccountsMerge;
import com.company.Contest176.Problem4;
import com.company.Contest176.ProductOfNumbers;
import com.company.DesignCircularDeque641.MyCircularDeque;
import com.company.TheEarliestMomentWhenEveryoneBecomeFriends1101.TheEarliestMomentWhenEveryoneBecomeFriends;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //


    public static void main(String[] args) throws IOException {
        MyCircularDeque circularDeque = new MyCircularDeque(3); // set the size to be 3
        circularDeque.insertLast(1);			// return true
        circularDeque.insertLast(2);			// return true
        circularDeque.insertFront(3);			// return true
        circularDeque.insertFront(4);			// return false, the queue is full
        int val = circularDeque.getRear();  			// return 2
        circularDeque.isFull();				// return true
        circularDeque.deleteLast();			// return true
        circularDeque.insertFront(4);			// return true
        circularDeque.getFront();			// return 4
    }
}
