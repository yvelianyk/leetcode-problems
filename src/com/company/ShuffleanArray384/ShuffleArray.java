package com.company.ShuffleanArray384;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ShuffleArray {

    private int[] nums;
    private int[] original;
    private Random rand = new Random();

    public ShuffleArray(int[] nums) {
        this.original = nums.clone();
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        this.nums = this.original;
        this.original = this.original.clone();
        return this.nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < original.length; i++) {
            int index = getRandomIndex(i);
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        return nums;
    }


    private int getRandomIndex(int start) {
        int length = original.length;
        return rand.nextInt(length - start) + start;
    }
}
