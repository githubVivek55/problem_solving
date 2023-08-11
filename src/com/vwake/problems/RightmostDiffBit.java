package com.vwake.problems;

public class RightmostDiffBit {
    public static void main(String[] args) {
        int m =52,n=4;
        int ans = getFirstSetBit(m^n);
        System.out.println(ans);
    }

    public static int getFirstSetBit(int n){
        int c=0;
        while (n>0){
            c++;
            if((n&1)==1){
                return c;
            }
            n=n>>1;
        }
        return c;
    }

}
