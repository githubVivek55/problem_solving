package com.vwake.problems;

public class LongestOnes {
    public static void main(String[] args) {
        int N=1;
        int count = 0;
        int max=0;
        while(N>0){
            if((N&1)==1){
               count++;
            }else{
                count=0;
            }
            if(count>max){
                max=count;
            }
            N=N>>1;
        }
        System.out.println(max);
    }
}
