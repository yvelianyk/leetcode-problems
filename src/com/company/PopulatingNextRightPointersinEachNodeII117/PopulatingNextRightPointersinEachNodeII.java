package com.company.PopulatingNextRightPointersinEachNodeII117;

import com.company.PopulatingNextRightPointersinEachNode116.Node;

public class PopulatingNextRightPointersinEachNodeII {
    public Node connect(Node root) {
        if (root == null) return null;
        traverse(root, null);
        return root;
    }

    private void traverse(Node root, Node next) {
        if (root == null) return;
        root.next = next;

        Node nextRight = root.right;

        while (next != null) {
            if (next.right != null) nextRight = next.right;
            if (next.left != null) nextRight = next.left;
            if (next.left != null || next.right != null) break;
            next = next.next;
        }

        if (root.right != null) {
            traverse(root.right, root.right != nextRight ? nextRight : null);
            traverse(root.left, root.right);
        } else {
            traverse(root.left, nextRight);
        }

    }
}
