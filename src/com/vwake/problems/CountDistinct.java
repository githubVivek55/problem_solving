package com.vwake.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistinct {
    public static void main(String[] args) {
        int n = 3, k = 2;
        int A[] = {4,1,1};
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        list.add(map.size());
        for(int i=k;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(A[i-k],map.get(A[i-k])-1);
            if(map.get(A[i-k])==0){
                map.remove(A[i-k]);
            }
            list.add(map.size());
        }
        System.out.println(list);
    }
}
