package com.company.MergeSortedArray88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int read1 = m - 1;
        int read2 = n - 1;
        int write = m + n - 1;

        do {
            if (read1 == -1 && read2 > -1) {
                nums1[write--] = nums2[read2--];
                continue;
            }
            if (read2 == -1 && read1 > -1) {
                nums1[write--] = nums1[read1--];
                continue;
            }

            if (read2 == -1 && read1 == -1) return;

            nums1[write--] = nums1[read1] > nums2[read2] ?
                    nums1[read1--] :
                    nums2[read2--];

        } while (write != m + n);
    }
}
