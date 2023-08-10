package com.vwake.problems;

public class FirstSetBit {
    public static void main(String[] args) {
        int n = 12;
        String s="";
        int t = n;
        while (t>0){
            int r = t%2;
            s+=r;
            t/=2;
        }
        int res = 0;
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)=='1'){
                res = i;
                break;
            }
        }
        System.out.println(s);
        System.out.println(res+1);
    }
}
