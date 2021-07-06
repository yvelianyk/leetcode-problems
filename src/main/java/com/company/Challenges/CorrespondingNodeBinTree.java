package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;

// could be solved just by recursively going in to 2 trees simultaneously
public class CorrespondingNodeBinTree {
    ArrayList<Integer> finalPath;
    public final TreeNode getTargetCopy(
            final TreeNode original,
            final TreeNode cloned,
            final TreeNode target
    ) {
        // 0 - left, 1 - right
        ArrayList<Integer> path = new ArrayList<>();
        backtrack(original, target, path);

        TreeNode node = cloned;
        for (Integer direction : finalPath) {
            node = direction == 0 ? node.left : node.right;
        }

        return node;
    }

    private void backtrack(TreeNode node, TreeNode target, ArrayList<Integer> path) {
        if (node == target) {
            finalPath = (ArrayList) path.clone();
            return;
        }

        if (node.left != null) {
            path.add(0);
            backtrack(node.left, target, path);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            path.add(1);
            backtrack(node.right, target, path);
            path.remove(path.size() - 1);
        }
    }
}
