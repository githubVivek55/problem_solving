package com.vwake.problems;

import java.util.Arrays;

public class MinimizeHeights {
    public static void main(String[] args) {
        int arr[] ={2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int n = arr.length;
        int k = 5;
        int result = getMinDiff(arr,n,k);
        System.out.println("Output is ="+result);
    }
    public static int getMinDiff(int[] arr, int n, int k){
        if(n==1) return 0;
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];

        for(int i=1; i <n ;i++){
            if(arr[i]-k<0)continue ;
            int max = Math.max(arr[i-1]+k , arr[n-1]-k);
            int min = Math.min(arr[0]+k, arr[i]-k);
            diff=Math.min(diff , max-min);
        }
        return diff;
    }
}
