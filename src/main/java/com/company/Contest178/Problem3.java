package com.company.Contest178;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.LinkedListCycleII142.ListNode;

import java.util.List;

public class Problem3 {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return traverse(root, head);
    }

    private boolean traverse(TreeNode node, ListNode listNode) {
        if (node == null) return false;
        if (node.val == listNode.val && check(node, listNode)) return true;

        if (traverse(node.left, listNode)) return true;
        return traverse(node.right, listNode);
    }

    private boolean check(TreeNode node, ListNode listNode) {
        if (listNode == null) return true;
        if (node == null) return false;
        if (node.val != listNode.val) return false;

        ListNode next = listNode.next;
        if (check(node.left, next)) return true;
        return check(node.right, next);
    }
}
