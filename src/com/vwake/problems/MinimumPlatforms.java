package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 1100, 1235};
        int[] dep = {1000, 1200, 1240};

        int res = findPlatform(arr, dep, arr.length);
        System.out.println("Result=" + res);


    }

    static int findPlatform(int arr[], int dep[], int n) {
        HashMap<Integer,Integer> platform = new HashMap<>();
        platform.put(1,dep[0]);
        for(int i=1;i<n;i++){
            checkEmptyPlatform(platform, arr[i], dep[i]);
        }
        return platform.size();
    }
    static void checkEmptyPlatform(Map<Integer,Integer> map,int arr,int dep){
        int platform = -1;
        for(Map.Entry e: map.entrySet()){
            int t = (int)e.getValue();
            if(t<=arr){
                platform=(int)e.getKey();
            }
        }
        if(platform==-1){
            map.put(map.size()+1,dep);
        }else{
            map.put(platform,dep);
        }
    }
}
