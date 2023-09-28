package com.gfg.dynamicProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = {60,100,120};
        int[] wt={10,20,30};
        int w =50;
        int[][] dp = new int[val.length+1][w+1];
        for (int i = 0; i < val.length + 1; i++)
            Arrays.fill(dp[i],-1);

        int knapSack = knapSack(w, wt, val, val.length,dp);
        System.out.println(knapSack);
    }
    static int max(int a, int b) { return Math.max(a, b); }
    static int knapSack(int W, int[] wt, int[] val, int n, int[][] dp)
    {
        if(n==0 || W==0)
            return 0;

        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if(wt[n-1]>W){
            return dp[n][W]=knapSack(W,wt,val,n-1,dp);
        }else{
            return dp[n][W]= max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1,dp),
                    knapSack(W,wt,val,n-1,dp));
        }
    }
}
