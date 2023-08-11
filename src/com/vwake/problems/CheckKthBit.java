package com.vwake.problems;

public class CheckKthBit {
    public static void main(String[] args) {
        int n = 500;
        int k=3;
        String s="";
        int t = n;
        while (t>0){
            int r = t%2;
            s+=r;
            t/=2;
        }
        System.out.println(s);
        int l = Integer.parseInt(String.valueOf(s.charAt(k)));
        System.out.println(l==1);
    }
}
