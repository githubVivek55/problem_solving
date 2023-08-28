package com.gfg.greedy.heap;

import java.util.Arrays;

public class ChooseAndSwap {
    public static void main(String[] args) {
        String A = "abcdefgih";

        char []str = A.toCharArray();
        int MAX = 26,i=0,j=0;
        int n = A.length();
        int []chk = new int[MAX];

        Arrays.fill(chk, -1);

        for(i=0;i<n;i++){
            if(chk[str[i]-'a']==-1){
                chk[str[i]-'a']=i;
            }
        }

        for(i=0;i<n;i++){
            boolean flag=false;
            for(j=0;j<str[i]-'a';j++){
                if(chk[j]>chk[str[i]-'a']){
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(i<(n-1)){
            char ch1 = str[i];
            char ch2 = (char) (j+'a');
            for(i=0;i<n;i++){
                if(str[i]==ch1){
                    str[i]=ch2;
                }else if(str[i]==ch2){
                    str[i]=ch1;
                }
            }
        }
        System.out.println(String.valueOf(str));
    }
}
