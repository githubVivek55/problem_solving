package com.vwake.problems;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {8,8,2,4,5,5,1};
        long result = solution(arr,arr.length);
        System.out.println(result);
    }

    public static long solution(int[] arr, int n) {
        int max = arr[0];
        long stg =0;
        for(int i=1;i<n-1;i++){
            if(arr[i]<max){
                stg=stg+(max-arr[i]);
            }else{
                max=arr[i];
            }
        }
        return stg;
    }
}
