package com.company.NaryTreePostorderTraversal590;



import com.company.NaryTreePreorderTraversal589.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {

    // ITERATIVE:
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            result.add(curr.val);
            for (int i = 0; i < curr.children.size(); i++) {
                stack.push(curr.children.get(i));
            }
        }
        Collections.reverse(result);
        return result;
    }



//    // RECURSIVELLY:
//    public List<Integer> postorder(Node root) {
//        List<Integer> result = new ArrayList<>();
//        if(root == null) return result;
//        traverse(root, result);
//        return result;
//    }
//
//    private void traverse(Node root, List<Integer> result) {
//        for (int i = 0; i < root.children.size(); i++) {
//             traverse(root.children.get(i), result);
//        }
//        result.add(root.val);
//    }
}

