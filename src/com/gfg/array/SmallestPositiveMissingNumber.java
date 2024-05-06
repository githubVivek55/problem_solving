package com.gfg.array;

import java.util.Arrays;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0 ,1 ,2, 3, 4 ,5, 6, 7, 8 ,9 ,10, 11};
        int missingNumber = missingNumber(arr, arr.length);
        System.out.println(missingNumber);
    }

    static int missingNumber(int arr[], int size) {
        Arrays.sort(arr);
        int num=1;
        for(int i : arr){
            if(i==num){
                num++;
            }
        }
        return num;
    }
}
