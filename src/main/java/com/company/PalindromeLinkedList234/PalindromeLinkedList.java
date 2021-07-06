package com.company.PalindromeLinkedList234;

import com.company.LinkedListCycleII142.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        Stack<ListNode> stack = new Stack<>();
        Queue<ListNode> queue = new LinkedList<>();

        ListNode node = head;
        while (node != null) {
            stack.push(node);
            queue.add(node);
            node = node.next;
        }

        int size = stack.size() / 2;
        for (int i = 0; i <= size; i++) {
             ListNode fromStack = stack.pop();
             ListNode fromQueue = queue.poll();
             if (fromQueue.val != fromStack.val) return false;
        }
        return true;
    }

}
