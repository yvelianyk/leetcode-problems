package com.company.InorderSuccessorinBST285;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class InorderSuccessorinBST {

    private boolean isTargetFound = false;
    private TreeNode result;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        traverse(root, p);
        return result;
    }

    private void traverse(TreeNode node, TreeNode target) {
        if(node == null) return;
        traverse(node.left, target);
        if(isTargetFound) {
            result = node;
            isTargetFound = false;
        }

        if(node == target) {
            isTargetFound = true;
        }

        traverse(node.right, target);
    }
}
