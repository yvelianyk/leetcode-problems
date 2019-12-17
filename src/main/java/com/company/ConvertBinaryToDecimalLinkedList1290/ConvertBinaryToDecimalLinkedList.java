package com.company.ConvertBinaryToDecimalLinkedList1290;

import com.company.LinkedListCycleII142.ListNode;

public class ConvertBinaryToDecimalLinkedList {
    public int getDecimalValue(ListNode head) {
        int[] result = traverse(head);
        return result[0];
    }

    private int[] traverse(ListNode node) {
        if (node.next == null) {
            return new int[]{node.val, 0};
        }

        int[] prev = traverse(node.next);
        int result = prev[0] + node.val * (int) Math.pow(2, prev[1] + 1);
        return new int[]{result, prev[1] + 1};
    }
}
