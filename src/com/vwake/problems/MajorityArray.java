package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityArray {
    public static void main(String[] args) {
        int N = 5;
        int A[] = {3,1,3,3,2};
        int index = -1;
        int majority = N/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        map.forEach((key,val)-> System.out.println(key+"----"+val));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(majority<=entry.getValue()){
                index = entry.getKey();
            }
        }
        System.out.println(index);
    }
}
