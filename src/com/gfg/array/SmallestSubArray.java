package com.gfg.array;

import java.util.Arrays;

public class SmallestSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        int i = smallestSubWithSum(x, arr);
        System.out.println(i);
    }
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here

        if(Arrays.stream(arr).sum()<=x)return 0;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            int j=0;
            while (sum<=x && (i+j)<arr.length){
                sum+=arr[i+j];
                j++;
            }
            if(sum>x && j<smallest){
                smallest = j;
            }
        }
        return smallest;
    }
}
