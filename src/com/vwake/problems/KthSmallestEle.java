package com.vwake.problems;

import java.util.Arrays;

public class KthSmallestEle {
    public static void main(String[] args) {
        int[] arr ={7, 10, 4, 3, 20, 15};
        int k=3;
        int res = KthSmallest(arr,k);
        System.out.println("Output is: "+res);
    }
    public static int KthSmallest(int[] arr, int k){
        int res=0;
        int max = Arrays.stream(arr).max().getAsInt();
        int[] arr2 = new int[max+1];
        for(int i=0;i<arr.length;i++){
            arr2[arr[i]]++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>0){
                k--;
            }
            if(k==0){
                res = i;
                break;
            }
        }
        return res;
    }
}
