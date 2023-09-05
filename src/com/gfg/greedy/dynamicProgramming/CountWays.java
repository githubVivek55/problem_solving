package com.gfg.greedy.dynamicProgramming;

public class CountWays {
    public static void main(String[] args) {
        long l = countWays(80);
        System.out.println(l);
    }
    static long countWays(int n){
        if (n==1){
            return 1;
        }
        long[] res = new long[n+1];
        res[0] = 1;
        res[1] =1;
        res[2] = 2;

        for(int i=3;i<=n;i++){
            res[i] = (res[i-1]+res[i-2]+res[i-3])%1000000007;
        }
        return res[n];
    }
}
