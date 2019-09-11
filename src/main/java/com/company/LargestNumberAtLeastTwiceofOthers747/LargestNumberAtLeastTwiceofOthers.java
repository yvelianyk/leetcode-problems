package com.company.LargestNumberAtLeastTwiceofOthers747;

public class LargestNumberAtLeastTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        boolean result = true;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[maxIndex]) {
                result = result && ((nums[i] * 2) <= nums[maxIndex]);
            }
        }

        return result ? maxIndex : -1;
    }
}
