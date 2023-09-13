package com.gfg.dynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2,5,3,6};
        int N = 4, sum = 10;
        long[][] dp = new long[N+1][sum+1];
        for(long[] d:dp)
            Arrays.fill(d,-1);
        long count = count(coins, N, sum,dp);
        System.out.println(count);
    }

    public static long count(int[] coins, int n, int sum, long[][] dp) {
        if(sum==0){
            return dp[n][sum]=1;
        }
        if(sum<0 ||n<=0){
            return 0;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }

        return dp[n][sum]=count(coins,n,sum-coins[n-1],dp) + count(coins,n-1,sum,dp);
    }
}
