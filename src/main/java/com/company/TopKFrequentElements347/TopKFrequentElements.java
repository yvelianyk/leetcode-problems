package com.company.TopKFrequentElements347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    private TreeNode tree;
    List<Integer> result;
    private int count = 0;
    private int kNumber = 0;

    public List<Integer> topKFrequent(int[] nums, int k) {
        result = new ArrayList<>();
        kNumber = k;
        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int count = map.get(num);
                map.put(num, ++count);
            } else {
                map.put(num, 1);
            }
        }


        for (Map.Entry<Integer, Integer> integerEntry : map.entrySet()) {
            if (tree == null) {
                tree = new TreeNode(integerEntry.getKey(), integerEntry.getValue());
            } else {
                insert(tree, integerEntry.getKey(), integerEntry.getValue());
            }
        }

        buildArray(tree);

        return result;
    }

    private void buildArray (TreeNode node) {
        if (node == null) return;
        buildArray(node.right);
        if (count < kNumber) {
            result.add(node.val);
            count++;
        }
        buildArray(node.left);
    }

    private TreeNode insert(TreeNode node, int value, int number) {
        if (node == null) return new TreeNode(value, number);

        if (number > node.number) {
            node.right = insert(node.right, value, number);
        } else {
            node.left = insert(node.left, value, number);
        }
        return node;
    }

    class TreeNode {
        public int val;
        public int number;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x, int y) {
            number = y;
            val = x;
        }
    }
}
