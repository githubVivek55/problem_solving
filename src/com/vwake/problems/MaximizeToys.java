package com.vwake.problems;

import java.util.Arrays;

public class MaximizeToys {
    public static void main(String[] args) {
        int arr[] = {1, 12, 5, 111, 200, 1000, 10};
        int K=50;

        Arrays.sort(arr);
        int count = 0;
        for(int a: arr){
            if(K>=a){
                K=K-a;
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
