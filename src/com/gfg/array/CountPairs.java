package com.gfg.array;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1};
        int k=6;
        int res = getPairsCount(arr,arr.length,k);
        System.out.println(res);
    }
    public static int getPairsCount(int[] arr, int n, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int rem = k-arr[i];
            count = count+map.getOrDefault(rem,0);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
