package com.company.Challenges;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class VerticalOrderTraversal {
    Map<Integer, List<Node>> map;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        map = new TreeMap<>();
        dfs(root, 0, 0);

        for (List<Node> nodeList : map.values()) {
            Collections.sort(nodeList, new Comparator<Node>() {
                @Override
                public int compare(Node node1, Node node2) {
                    return node1.y == node2.y ?
                            Integer.compare(node1.value, node2.value) :
                            Integer.compare(node2.y, node1.y);
                }
            });
            List<Integer> innerRes = new ArrayList<>();
            for (Node node : nodeList) innerRes.add(node.value);

            result.add(innerRes);
        }

        return result;
    }

    private void dfs(TreeNode treeNode, int x, int y) {
        if (treeNode == null) return;
        Node newNode = new Node(x, y, treeNode.val);
        List<Node> nodeList = map.getOrDefault(x, new ArrayList<>());
        nodeList.add(newNode);
        map.put(x, nodeList);
        dfs(treeNode.left, x - 1, y - 1);
        dfs(treeNode.right, x + 1, y - 1);
    }

    private class Node {
        int x;
        int y;
        int value;

        Node(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
}
