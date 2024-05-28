package com.gfg.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class JoinRope {
    public static void main(String[] args) {
        long[] arr = {4,2,7,6,9};
        long result = minCost(arr, arr.length);
        System.out.println(result);
    }

    private static long minCost(long[] arr, int length) {
        if(length==1){
            return arr[0];
        }
        Queue<Long> pq = new PriorityQueue<>();
        for(Long i: arr){
            pq.add(i);
        }
        long total=0;
        while (pq.size()>1){
            Long sum = pq.poll()+pq.poll();
            total+=sum;
            pq.add(sum);
        }
        //
        return total;
    }

}
