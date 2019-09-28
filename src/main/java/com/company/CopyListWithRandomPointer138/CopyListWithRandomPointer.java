package com.company.CopyListWithRandomPointer138;

import java.util.*;

public class CopyListWithRandomPointer {

    // MY SOLUTION: ITERATIVE, NOT SO SOPHISTICATED BUT IS USES LESS MEMORY THEN RECURSIVE
    // IDEA IS JUST CREATE MAP OF CLONED NODES.
    // SECOND ITERATION OVER LINKED LIST IS FOR CREATING RELATIONS BETWEEN NODES(NEXT AND RANDOM)
    public Node copyRandomList(Node head) {
        Map<Node, Node> clonedMap = new HashMap<>();

        Node node = head;
        while (node != null) {
            Node clonedNode = new Node();
            clonedNode.val = node.val;
            clonedMap.put(node, clonedNode);
            node = node.next;
        }

        node = head;
        while (node != null) {
            Node clonedNode = clonedMap.get(node);
            Node nextNode = node.next;
            clonedNode.next = clonedMap.getOrDefault(nextNode, null);
            Node randomNode = node.random;
            clonedNode.random = clonedMap.get(randomNode);
            node = node.next;
        }
        return clonedMap.get(head);
    }


    // COPIED SOLUTION: RECURSIVE SOLUTION: VERY SOPHISTICATED
    // WE CONSIDER LINKED LIST WITH RANDOM NODE AS A GRAPH WITH
    // 2 POINTERS. AND AFTER THAT WE JUST TRAVERS GRAPH BY DFS
    // AND USE VISITED HASH MAP FOR RECURSIVE CLONING GRAPH
//    HashMap<Node, Node> visitedHash = new HashMap<Node, Node>();
//
//    public Node copyRandomList(Node head) {
//        if (head == null) return null;
//
//        if (this.visitedHash.containsKey(head)) {
//            return this.visitedHash.get(head);
//        }
//
//        Node node = new Node(head.val, null, null);
//        this.visitedHash.put(head, node);
//        node.next = this.copyRandomList(head.next);
//        node.random = this.copyRandomList(head.random);
//        return node;
//    }
}

// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
