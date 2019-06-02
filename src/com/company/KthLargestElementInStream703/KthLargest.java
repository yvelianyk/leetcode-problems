package com.company.KthLargestElementInStream703;

public class KthLargest {

    private TreeNodeCnt bst;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (bst == null) {
                initBst(num);
            } else {
                addToBst(bst, num);
            }
        }

    }

    private void initBst(int num) {
        bst = new TreeNodeCnt(num);
        bst.count++;
    }

    public int add(int val) {
        if (bst == null) initBst(val);
        addToBst(bst, val);
        return search(bst, k);
    }

    private int search(TreeNodeCnt node, int cnt) {
        int leftCount = node.left == null ? 0 : node.left.count;
        int rightCount = node.right == null ? 0 : node.right.count;
        int rightPart = node.count - leftCount;

        if(cnt <= rightCount) {
            return search(node.right, cnt);
        } else if(cnt == rightPart) {
            return node.val;
        } else {
            return search(node.left, cnt - rightPart);
        }
    }

    private TreeNodeCnt addToBst(TreeNodeCnt node, int val) {
        if(node == null) return null;
        TreeNodeCnt curr;
        node.count++;
        if (val < node.val) {
            curr = addToBst(node.left, val);
            if (curr == null) {
                TreeNodeCnt newNode = new TreeNodeCnt(val);
                newNode.count++;
                node.left = newNode;
            }
        } else {
            curr = addToBst(node.right, val);
            if (curr == null) {
                TreeNodeCnt newNode = new TreeNodeCnt(val);
                newNode.count++;
                node.right = newNode;
            }
        }
        return node;
    }

    class TreeNodeCnt {
        public int val;
        public TreeNodeCnt left;
        public TreeNodeCnt right;
        public int count = 0;

        public TreeNodeCnt(int x) {
            val = x;
        }

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
