package com.gfg.strings;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        String encode = encode(s);
        System.out.println(encode);
    }
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(j)){
                int count = i-j;
                sb.append(s.charAt(j)).append(count);
                j=i;
            }
            if(i==s.length()-1){
                sb.append(s.charAt(j)).append(s.length()-j);
            }
        }
        return sb.toString();
    }
}
