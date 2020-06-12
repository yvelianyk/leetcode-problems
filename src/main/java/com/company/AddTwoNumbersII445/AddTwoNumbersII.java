package com.company.AddTwoNumbersII445;

import com.company.LinkedListCycleII142.ListNode;

import java.util.Stack;

public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode node1 = l1;
        ListNode node2 = l2;
        while (node1 != null) {
            stack1.push(node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            stack2.push(node2.val);
            node2 = node2.next;
        }

        Stack<Integer> bigger = stack1.size() > stack2.size() ? stack1 : stack2;
        Stack<Integer> smaller = stack1.size() <= stack2.size() ? stack1 : stack2;
        int carry = 0;
        ListNode prev = null;
        ListNode node = null;
        while (!bigger.isEmpty()) {
            int val1 = bigger.pop();
            int val2 = smaller.isEmpty() ? 0 : smaller.pop();
            int result = val1 + val2 + carry;
            carry = result > 9 ? 1 : 0;
            result %= 10;
            node = new ListNode(result);
            node.next = prev;
            prev = node;
        }
        if (carry == 1) {
            ListNode result = new ListNode(1);
            result.next = node;
            return result;
        }
        return node;
    }


}
