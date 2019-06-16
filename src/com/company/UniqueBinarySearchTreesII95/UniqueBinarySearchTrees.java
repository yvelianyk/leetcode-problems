package com.company.UniqueBinarySearchTreesII95;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return getSubTrees(1, n);
    }

    private List<TreeNode> getSubTrees(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start == end) {
            TreeNode node = new TreeNode(start);
            result.add(node);
            return result;
        }

        if (start > end) {
            result.add(null);
            return result;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> right = getSubTrees(i + 1, end);
            List<TreeNode> left = getSubTrees(start, i - 1);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode res = new TreeNode(i);
                    res.right = r;
                    res.left = l;
                    result.add(res);
                }
            }

        }


        return result;
    }


}
