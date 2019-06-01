package com.company.DeleteNodeinBST450;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

public class DeleteNodeinBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            TreeNode succesor = findSuccessor(root.right);
            root.val = succesor.val;
            root.right = deleteNode(root.right, succesor.val);
        }

        return root;
    }

    private TreeNode findSuccessor(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

}
