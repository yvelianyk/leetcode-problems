package com.company.SerializeandDeserializeBinaryTree297;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class SerializeandDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder result = new StringBuilder();
        result.append('[');
        result.append(root.val);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean notLastLevel = false;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                 TreeNode curr = queue.poll();

                 if (curr.left != null) {
                     queue.add(curr.left);
                     notLastLevel = true;
                     list.add(curr.left.val);
                 } else {
                     list.add(null);
                 }

                 if (curr.right != null) {
                     queue.add(curr.right);
                     notLastLevel = true;
                     list.add(curr.right.val);
                 } else {
                     list.add(null);
                 }
            }
            if (notLastLevel) {
                result.append(',');
                for (int j = 0; j < list.size(); j++) {
                    result.append(list.get(j));
                    if (j < list.size() - 1) result.append(',');
                }
            }
        }
        result.append(']');

        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        Map<Integer, TreeNode> nodesMap = new HashMap<>();
        String pure = data.substring(1, data.length() - 1);
        String[] arrOfStr = pure.split(",");
        int k = 1;
        nodesMap.put(0, new TreeNode(Integer.parseInt(arrOfStr[0])));
        for (int i = 0; i <= arrOfStr.length; i++) {
            if (!nodesMap.containsKey(i)) {
                k--;
                continue;
            }
            TreeNode root = nodesMap.get(i);
            int leftIndex = i + k;
            int rightIndex = i + k + 1;
            boolean isLeftNull = leftIndex > arrOfStr.length - 1 || arrOfStr[leftIndex].equals("null");
            boolean isRightNull = rightIndex > arrOfStr.length - 1 || arrOfStr[rightIndex].equals("null");

            if (!isLeftNull) {
                TreeNode left = new TreeNode(Integer.parseInt(arrOfStr[leftIndex]));
                nodesMap.put(leftIndex, left);
                root.left = left;
            }
            if (!isRightNull) {
                TreeNode right = new TreeNode(Integer.parseInt(arrOfStr[rightIndex]));
                nodesMap.put(rightIndex, right);
                root.right = right;
            }
            k++;
        }

        return nodesMap.get(0);
    }
}
