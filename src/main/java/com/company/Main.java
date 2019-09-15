package com.company;

import com.company.FlattenDoubleLinkedList430.DoublyNode;
import com.company.FlattenDoubleLinkedList430.FlattenDoubleLinkedList;

public class Main {

    public static void main(String[] args) {

        DoublyNode nodeMinus1 = new DoublyNode();
        DoublyNode nodeMinus2 = new DoublyNode();
        DoublyNode nodeMinus3 = new DoublyNode();

        nodeMinus1.val = 1;
        nodeMinus2.val = 2;
        nodeMinus3.val = 3;

        nodeMinus1.next = nodeMinus2;
        nodeMinus2.prev = nodeMinus1;

        nodeMinus2.next = nodeMinus3;
        nodeMinus3.prev = nodeMinus2;

        DoublyNode node0 = new DoublyNode();
        DoublyNode node1 = new DoublyNode();
        DoublyNode node2 = new DoublyNode();
        DoublyNode node3 = new DoublyNode();
        DoublyNode node4 = new DoublyNode();
        DoublyNode node5 = new DoublyNode();

        node0.val = 7;
        node1.val = 8;
        node2.val = 9;
        node3.val = 10;
        node4.val = 11;
        node5.val = 12;

        node0.next = node1;
        node1.prev = node0;

        node1.next = node2;
        node2.prev = node1;

        node2.next = node3;
        node3.prev = node2;

        node4.next = node5;
        node5.prev = node4;

        node1.child = node4;

        nodeMinus1.child = node0;

        FlattenDoubleLinkedList solution = new FlattenDoubleLinkedList();
        DoublyNode result = solution.flatten(nodeMinus1);
        System.out.println(result);

    }
}
