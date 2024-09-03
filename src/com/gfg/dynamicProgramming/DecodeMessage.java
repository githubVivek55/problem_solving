package com.gfg.dynamicProgramming;

import java.util.Arrays;

public class DecodeMessage {
    public static void main(String[] args) {
        int i = CountWays("1422");
        System.out.println(i);
    }
    public static int CountWays(String str)
    {
        // code here
int[] dp = new int[str.length()];
        Arrays.fill(dp,-1);
        if(str.isEmpty() || str.startsWith("0")){
            return 0;
        }

        return traverse(str,0,str.length(),dp);
    }
    public static int traverse(String str, int i,int n, int[] dp){
        if(i>=n){
            return 1;
        }
        if(dp[i]!=-1)return dp[i]%1000000007;

        if(str.charAt(i)=='0'){
            return 0;
        }
        int a,b=0;
        a = traverse(str,i+1,n,dp);
        if(i!=n-1 && (str.charAt(i)=='1' || (str.charAt(i)=='2' && str.charAt(i+1)<='6'))){
            b = traverse(str,i+2,n,dp);
        }
        return dp[i]=(a+b)%1000000007;
    }
}
