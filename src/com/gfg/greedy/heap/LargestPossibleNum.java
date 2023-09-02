package com.gfg.greedy.heap;

public class LargestPossibleNum {
    public static void main(String[] args) {
        int N=4,S=36;
        System.out.println(get(N,S));
    }
    public static String get(int N,int S){
        int sum=0;
        StringBuilder digit = new StringBuilder();
        if((N>1 && S==0)||(N*9<S)){
            System.out.println("-1");
            return "-1";
        }
        for(int i=0;i<N;i++){
            if(S<=9){
                digit.append(S);
                S=0;
            }else{
                digit.append(9);
                S-=9;
            }
        }
        if(S>sum){
            return "-1";
        }
        return digit.toString();
    }
}
