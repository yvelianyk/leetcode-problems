package com.company;

import com.company.BinaryTreePostorderTraversal145.TreeNode;
import com.company.Contest178.Problem1;
import com.company.Contest178.Problem2;
import com.company.Contest178.Problem3;
import com.company.Contest180.Problem4;
import com.company.LinkedListCycleII142.ListNode;
import com.company.SerializeandDeserializeBinaryTree297.SerializeandDeserializeBinaryTree;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Problem3 solution = new Problem3();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(8);
        SerializeandDeserializeBinaryTree serializer = new SerializeandDeserializeBinaryTree();
        TreeNode root = serializer.deserialize("[1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]");
        boolean result = solution.isSubPath(head, root);
        System.out.println(result);
    }
}
