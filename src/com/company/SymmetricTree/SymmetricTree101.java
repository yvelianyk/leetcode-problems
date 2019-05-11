package com.company.SymmetricTree;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class SymmetricTree101 {

    // =========================================================
    // RECURSIVE:
    // =========================================================

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSymmetricNodes(root, root);
    }

    private boolean isSymmetricNodes(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;

        return isSymmetricNodes(node1.left, node2.right) &&
                isSymmetricNodes(node1.right, node2.left) &&
                node1.val == node2.val;
    }


    // =========================================================
    // ITERATIVE(DFS):
    // =========================================================

//    public boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode t1 = queue.poll();
//            TreeNode t2 = queue.poll();
//
//            if(t1 == null && t2 == null) continue;
//            if(t1 == null || t2 == null) return false;
//            if(t1.val != t2.val) return false;
//
//            queue.add(t1.left);
//            queue.add(t2.right);
//            queue.add(t1.right);
//            queue.add(t2.left);
//        }
//
//        return true;
//
//    }
}
