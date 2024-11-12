package com.gfg.medium;

public class FibonaciSum {
    public static void main(String[] args) {
        long l = fibSum(3);
        System.out.println(l);
    }

    static long fibSum(long N) {
        // code here
        long f1 = 0, f2 = 1,sum=1;
        for (long i = 1; i < N; i++) {
            long t = f2;
            f2 = (f1 + f2)%1000000007;
            f1 = t;
            sum+=f2;
        }
        return sum%1000000007;
    }
}
