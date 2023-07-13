package com.vwake.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertSeqToKeypad {
    public static void main(String[] args) {
        String S = "HEY U";
        String ans ="";
        String str[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==32){
                ans+="0";
            }else{
                int t = S.charAt(i)-'A';
                ans+=str[t];
            }
        }
        System.out.println(ans);
    }

}
