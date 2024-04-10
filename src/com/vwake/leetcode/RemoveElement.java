package com.vwake.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =3;

        int removeElement = removeElement(nums, val);
        System.out.println(removeElement);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        //        [0,1,2,2,3,0,4,2]
        int k=0;
        int l=1;
        while(k<(nums.length-count) && l<nums.length){
            if(nums[k]==val && nums[l]==val){
                l++;
            }else if(nums[k]==val && nums[l]!=val){
                int t = nums[k];
                nums[k]=nums[l];
                nums[l]=t;
                k++;
            }else{
                l++;
                k++;
            }
        }
        return nums.length-count;
    }
    public static int solutionTwo(int[] nums, int val){
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
