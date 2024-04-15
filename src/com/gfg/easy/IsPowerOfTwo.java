package com.gfg.easy;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        Boolean ANS = isPowerofTwo(98);
        Boolean ANS2 = solutionTwo(98);
        System.out.println(ANS);
        System.out.println(ANS2);
    }

    public static boolean isPowerofTwo(long n){
        long c = n;
        while(c!=1){
            if(c%2!=0){
                return false;
            }
            c=c/2;
        }
        return true;
    }

    public static boolean solutionTwo(long n){
        if((n&(n-1))==0 && n!=0) return true;
        return false;
    }
}
