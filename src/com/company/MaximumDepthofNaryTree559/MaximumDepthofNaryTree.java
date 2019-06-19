package com.company.MaximumDepthofNaryTree559;

import com.company.NaryTreePreorderTraversal589.Node;

public class MaximumDepthofNaryTree {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        return getMax(root, 1);
    }

    private int getMax(Node node, int number) {
        int max = 0;
        if (node.children == null || node.children.size() == 0) {
            return number;
        }
        for (int i = 0; i < node.children.size(); i++) {
            int levelNumber = getMax(node.children.get(i), number + 1);
            max = Math.max(max, levelNumber);
        }

        return max;
    }
}
