package com.company.NaryTreePreorderTraversal589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {

    // ITERATIVE:
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            result.add(curr.val);
            int i = curr.children.size() - 1;
            for (; i >= 0; i--) stack.push(curr.children.get(i));
        }
        return result;

    }


    // RECURSIVE:
//    public List<Integer> preorder(Node root) {
//        List<Integer> result = new ArrayList<>();
//        traverse(root, result);
//        return result;
//    }
//
//    private void traverse(Node root, List<Integer> result) {
//        if (root == null) return;
//        result.add(root.val);
//        for (int i = 0; i < root.children.size(); i++) {
//             traverse(root.children.get(i), result);
//        }
//    }
}
