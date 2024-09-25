package com.gfg.array;

public class ExcelColumnMapping {
    public static void main(String[] args) {
        String s = colName(196);
        System.out.println(s);
    }

    static String colName(long n) {
        // your code here
        String[] arr = {"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        if(n<=26)
            return arr[(int)n];
        StringBuilder stringBuffer = new StringBuilder();
        while(n>0){
            long r=(n-1)%26;
            stringBuffer.append((char)(r+'A'));
            n=(n-1)/26;
        }
        return stringBuffer.reverse().toString();
    }
}
