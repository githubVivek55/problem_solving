package com.vwake.problems;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        String S = "pio.";
        String ans="";
        String[] arr = S.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            if(i!=0){
                ans+=".";
            }
        }
        System.out.println(ans);
    }
}
