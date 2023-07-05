package com.vwake.problems;

import java.util.ArrayList;

public class BuySellStokes {
    public static void main(String[] args) {
        int a[] = {100,180,260,310,40,535,695};
//        int a[] = {4, 2, 2, 2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                ArrayList<Integer> tranc = new ArrayList<>();
                tranc.add(i);
                tranc.add(i+1);
                result.add(tranc);
            }
        }
        System.out.println(result);
    }
}
