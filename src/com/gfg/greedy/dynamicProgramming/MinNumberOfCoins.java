package com.gfg.greedy.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumberOfCoins {
    public static void main(String[] args) {
        List<Integer> result = minPartitions(321);
        System.out.println(result);
    }

    static List<Integer> minPartitions(int N) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        List<Integer> result = new ArrayList<>();
        int t = N,i=0;
        while (t!=0 && i>=0){
            if(t>=notes[i]){
                t = t-notes[i];
                result.add(notes[i]);
                i--;
            }
            i++;
        }


        return result;
    }
}
