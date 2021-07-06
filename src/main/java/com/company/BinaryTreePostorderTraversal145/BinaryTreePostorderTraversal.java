package com.company.BinaryTreePostorderTraversal145;

import java.util.*;

public class BinaryTreePostorderTraversal {

    // =========================================================
    // RECURSIVE:
    // =========================================================

//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null) return result;
//        traverse(root, result);
//        return result;
//    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node.left != null) traverse(node.left, result);
        if (node.right != null) traverse(node.right, result);
        result.add(node.val);
    }

    // =========================================================
    // ITERATIVE(DFS):
    // =========================================================

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visited = new HashSet<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            TreeNode left = current.left;
            TreeNode right = current.right;
            boolean isVisitedLeft = visited.contains(left) || left == null;
            boolean isVisitedRight = visited.contains(right) || right == null;
            boolean isVisitedCurr = visited.contains(current);
            if((isVisitedLeft && isVisitedRight && !isVisitedCurr) || (left == null && right == null)) {
                result.add(current.val);
                visited.add(current);
            } else {
                stack.push(current);
            }

            if (right != null && !isVisitedRight) stack.push(right);
            if (left != null && !isVisitedLeft) stack.push(left);
        }

        return result;
    }


    // VERY SIMPLE DFS(REVERSE):
//    List<Integer> list = new ArrayList<>();
//    if(root == null) return list;
//    Stack<TreeNode> stack = new Stack<>();
//    stack.push(root);
//    while(!stack.empty()){
//        root = stack.pop();
//        list.add(0, root.val);
//        if(root.left != null) stack.push(root.left);
//        if(root.right != null) stack.push(root.right);
//    }
//    return list;

}
