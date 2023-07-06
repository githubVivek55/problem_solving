package com.vwake.problems;

import java.util.ArrayList;

public class MaximumSubarray {
    public static void main(String[] args) {
        int N = 10, k = 4;
//        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int arr[] = { 8 ,5 ,10 ,7 ,9 ,4 ,9 ,9 ,9 ,9};
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0,j=i+k-1;i<=N-k;i++,j++){
            int max = -1;
            int t =i;
            while(t<=j){
                if(arr[t]>max){
                    max = arr[t];
                }
                t++;
            }
            res.add(max);
        }
        System.out.println(res);
    }
}
