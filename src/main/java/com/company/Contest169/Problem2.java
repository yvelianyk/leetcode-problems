package com.company.Contest169;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public class Problem2 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> firstArray = new ArrayList<>();
        List<Integer> secondArray = new ArrayList<>();

        inorderTravers(root1, firstArray);
        inorderTravers(root2, secondArray);
        return mergeSorted(firstArray, secondArray);
    }

    private void inorderTravers(TreeNode node, List<Integer> array) {
        if (node == null) return;
        inorderTravers(node.left, array);
        array.add(node.val);
        inorderTravers(node.right, array);
    }

    private List<Integer> mergeSorted(List<Integer> a, List<Integer> b) {
        int first = 0;
        int second = 0;
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while ((first + second) < (a.size() + b.size())) {
            second = second == b.size() ? -1 : second;
            first = first == a.size() ? -1 : first;
            if (first == -1 && second == -1) break;
            if (second == -1) {
                result.add(i++, a.get(first++));
                continue;
            }
            if (first == -1) {
                result.add(i++, b.get(second++));
                continue;
            }

            if (a.get(first) <= b.get(second)) {
                result.add(i++, a.get(first));
                first++;
            } else {
                result.add(i++, b.get(second));
                second++;
            }
        }

        return result;
    }
}
