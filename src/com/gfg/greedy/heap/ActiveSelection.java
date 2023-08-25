package com.gfg.greedy.heap;

import java.util.Arrays;

public class ActiveSelection {
    public static void main(String[] args) {
        int n = 4;
        int start[] = {1, 3, 2, 5};
        int end[] = {2, 4, 3, 6};
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        int ans=1;
        int f = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>f){
                ans++;
                f=arr[i][1];
            }
        }
        System.out.println(ans);
    }
}
