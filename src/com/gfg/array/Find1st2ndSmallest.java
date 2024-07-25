package com.gfg.array;

import java.util.Arrays;

public class Find1st2ndSmallest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,1,1};
        int[] ints = minAnd2ndMin(arr);
        Arrays.stream(ints).forEach(System.out::println);
    }
    public static int[] minAnd2ndMin(int[] arr) {
        // code here
        if(arr.length==1){
            return new int[]{-1};
        }
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        int min2 = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < min2 && j != min) {
                min2 = j;
            }
        }
        if(min2==min || min2==Integer.MAX_VALUE){
            return new int[]{-1};
        }
        int[] res= new int[2];
        res[0]=min;
        res[1]=min2;
        return  res;
    }
}
