package com.gfg.strings;

import java.util.Arrays;

public class EditDistance {
    public static void main(String[] args) {
        String s = "geek", t = "gesek";
        int i = editDistance(s, t);
        System.out.println(i);
    }
    public static int editDistance(String s, String t) {
        // Code return ere
        int[][] memo= new int[s.length()+1][t.length()+1];

        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        int lcs = findLCS(s.toCharArray(), t.toCharArray(), s.length(), t.length(), memo);
        return lcs;
    }
    public static int findLCS(char[] s, char[] t, int m, int n, int[][] memo ){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(memo[m][n]!=-1){
            return memo[m][n];
        }

        if(s[m-1]==t[n-1]){
            memo[m][n] = findLCS(s,t,m-1,n-1,memo);
        }else{
            memo[m][n] = 1+Math.min(Math.min(findLCS(s,t,m-1,n,memo),findLCS(s,t,m,n-1,memo)),
                    findLCS(s,t,m-1,n-1,memo));
        }
        return memo[m][n];
    }
}
