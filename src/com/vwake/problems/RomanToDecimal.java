package com.vwake.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
/**
 * IX
 * IIIX
 *
   */
        String str = "XCIX";
        int total = 0;
        int prev = 0;
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int curr = map.get(String.valueOf(ch));
            if(curr<prev){
                total=total-curr;
            }else{
                total=total+curr;
            }
            prev=curr;
        }
        System.out.println(total);
    }
}
