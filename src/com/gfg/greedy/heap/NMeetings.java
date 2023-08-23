package com.gfg.greedy.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NMeetings {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int n = 6;
        int m[][] = new int[n][2];
        for(int i=0;i<n;i++){
            m[i][0] = start[i];
            m[i][1] = end[i];
        }
        Arrays.sort(m,(a, b) -> a[1] - b[1]);

        int c = 1;
        int e = m[0][1];
        for(int i=1;i<m.length;i++){
            if(m[i][0] > e){
                e = m[i][1];
                c++;
            }
        }
        System.out.println(c);
    }
}
