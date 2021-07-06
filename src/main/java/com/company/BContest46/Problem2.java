package com.company.BContest46;

public class Problem2 {
    public boolean canChoose(int[][] groups, int[] nums) {
        int next = 0;
        for (int[] group : groups) {
            int[] cont = isContains(group, nums, next);
            if (cont[0] == -1 && cont[1] == -1) {
                return false;
            } else {
                next = cont[1] + 1;
            }
        }

        return true;
    }

    private int[] isContains(int[] group, int[] nums, int start) {
        int first = group[0];
        int[] result = new int[]{-1,-1};
        for (int i = start; i < nums.length; i++) {
            int num = nums[i];
            if (num == first) {
                int k = i;
                int j = 0;
                boolean isContain = true;
                int size = i + group.length - 1;
                while (k <= size && k < nums.length) {
                    if (nums[k] != group[j]) {
                        isContain = false;
                    }
                    k++;
                    j++;
                }
                if (isContain) {
                    result = new int[]{i, i + group.length - 1};
                    break;
                }
            }
        }
        return result;
    }
}
