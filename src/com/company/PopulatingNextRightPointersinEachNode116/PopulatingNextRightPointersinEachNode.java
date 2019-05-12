package com.company.PopulatingNextRightPointersinEachNode116;

public class PopulatingNextRightPointersinEachNode {

    // RECURSIVE SOLUTION

    public Node connect(Node root) {
        if (root == null) return null;
        traverse(root.left, root.right);
        return root;
    }

    private void traverse(Node left, Node right) {
        if (left == null || right == null) return;

        left.next = right;
        traverse(left.left, left.right);
        traverse(left.right, right.left);
        traverse(right.left, right.right);
    }


    // BFS WITH EXTRA SPACE - NOT FIT
//    public Node connect(Node root) {
//        if (root == null) return null;
//        Queue<Node> queue = new LinkedList<>();
//
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Node> levelNodes = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                Node current = queue.poll();
//                if (current.left != null) {
//                    queue.add(current.left);
//                    levelNodes.add(current.left);
//                }
//                if (current.right != null) {
//                    queue.add(current.right);
//                    levelNodes.add(current.right);
//                }
//            }
//
//            for (int i = 0; i < levelNodes.size(); i++) {
//                Node current = levelNodes.get(i);
//                if (i < levelNodes.size() - 1) current.next = levelNodes.get(i + 1);
//            }
//
//        }
//
//        return root;
//
//    }

}


