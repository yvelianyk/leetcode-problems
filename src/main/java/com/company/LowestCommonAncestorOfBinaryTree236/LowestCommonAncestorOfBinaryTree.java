package com.company.LowestCommonAncestorOfBinaryTree236;

import com.company.BinaryTreePostorderTraversal145.TreeNode;

import java.util.*;

public class LowestCommonAncestorOfBinaryTree {

    // =========================================================
    // BRUTEFORCE(O(N logN)):
    // =========================================================

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        List<TreeNode> listP = new ArrayList<>();
//        List<TreeNode> listQ = new ArrayList<>();
//        listP.add(p);
//        listQ.add(q);
//        if(p.val == q.val) return p;
//        TreeNode parentP = getParent(root, p.val);
//        TreeNode parentQ = getParent(root, q.val);
//
//        while (parentP.val != root.val) {
//            listP.add(parentP);
//            parentP = getParent(root, parentP.val);
//        }
//
//        while (parentQ.val != root.val) {
//            listQ.add(parentQ);
//            parentQ = getParent(root, parentQ.val);
//        }
//
//        listP.add(root);
//        listQ.add(root);
//
//        int minSize = listP.size() <= listQ.size() ? listP.size() : listQ.size();
//        int readP = listP.size() - 1;
//        int readQ = listQ.size() - 1;
//        TreeNode result = root;
//
//        for (int i = minSize - 1; i >= 0; i--) {
//             if(listP.get(readP) == listQ.get(readQ)) {
//                 result = listP.get(readP);
//             }
//             readP--;
//             readQ--;
//        }
//
//        return result;
//    }
//
//    private TreeNode getParent(TreeNode root, int value) {
//        if (root.val == value) return root;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode curr = queue.poll();
//                if (
//                        (curr.left != null && curr.left.val == value) ||
//                        (curr.right != null && curr.right.val == value)
//                ) {
//                    return curr;
//                }
//
//                if (curr.left != null) queue.add(curr.left);
//                if (curr.right != null) queue.add(curr.right);
//            }
//        }
//
//        return root;
//    }


    // =========================================================
    // USE MAP WITH PARENT RELATIONS(O(N)):
    // =========================================================

//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Map<TreeNode, TreeNode> relationsMap = new HashMap<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        queue.add(root);
//        relationsMap.put(root, null);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                 TreeNode curr = queue.poll();
//                 if (curr.left != null) {
//                     relationsMap.put(curr.left, curr);
//                     queue.add(curr.left);
//                 }
//                 if (curr.right != null) {
//                     relationsMap.put(curr.right, curr);
//                     queue.add(curr.right);
//                 }
//            }
//        }
//
//        Set<TreeNode> ancestorsP = new HashSet<>();
//        ancestorsP.add(p);
//        TreeNode parent = relationsMap.get(p);
//        while (parent != null) {
//            ancestorsP.add(parent);
//            parent = relationsMap.get(parent);
//        }
//
//        while (!ancestorsP.contains(q)) q = relationsMap.get(q);
//        return q;
//    }

    // =========================================================
    // USE RECURSIVE SOLUTION DFS (O(N)):
    // =========================================================

    private TreeNode answer;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.traverse(root, p, q);
        return this.answer;
    }

    private boolean traverse(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return false;

        int left = traverse(node.left, p, q) ? 1 : 0;
        int right = traverse(node.right, p, q) ? 1 : 0;
        int mid = (node == p || node == q) ? 1 : 0;

        if(left + right + mid >= 2) this.answer = node;

        return left + right + mid > 0;
    }

}
