package com.vwake.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * @param nums1 [1,2,3,0,0,0]
     * @param m
     * @param nums2 [2,5,6]
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int e1 = m - 1;
        int e2 = n - 1;
        int k = (m + n) - 1;

        while(e1>=0 && e2>=0){
            if(nums1[e1]>nums2[e2]){
                nums1[k]=nums1[e1];
                e1-=1;
            }else{
                nums1[k]=nums2[e2];
                e2-=1;
            }
            k-=1;
        }
        while(e2>=0){
            nums1[k]=nums2[e2];
            e2-=1;
            k-=1;
        }
    }
}
