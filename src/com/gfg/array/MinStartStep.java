package com.gfg.array;

/*
* Problem Desc: we need to find the minimum start
* number in a such way that, sum remain >=1 of all array element
* array element contains value -100 <=n<=100*/
public class MinStartStep {
    public static void main(String[] args) {
        int[] inp = {-3,2,-3,4,2};
        System.out.println(findMinStartValue(inp));
    }
    static int findMinStartValue(int[] input){
        int minRetValue = 1;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int num: input){
            sum+=num;
            min = Math.min(sum,min);
        }
        if(min<1){
            minRetValue = 1-min;
        }
        return minRetValue;
    }
}
