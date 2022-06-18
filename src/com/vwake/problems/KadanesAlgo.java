package com.vwake.problems;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] arr ={-1,-2,-3,-4};
        int n=4;
        long ans = maxSubArraySum(arr,n);
        System.out.println("Output: "+ans);
    }
    public static long maxSubArraySum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
