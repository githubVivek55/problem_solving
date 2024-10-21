package com.gfg.strings;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        String input = "uwvlyhdrxbvyhygmcaszlp";
        String s = countSort(input);
        System.out.println(s);
    }
    public static String countSort(String arr)
    {
        // code here
        char[] chars = arr.toCharArray();
        int max = 0;
        for(char ch: chars){
            if(ch-96 >max)
                max = ch - 96;
        }
        System.out.println(max);
        int[] count_Arr = new int[max+1];
        for (char ch: chars){
            count_Arr[ch-96]++;
        }
        int pre_sum = 0;
        for(int i=0;i<count_Arr.length;i++){
            count_Arr[i] = count_Arr[i]+pre_sum;
            pre_sum = count_Arr[i];
        }
        //Arrays.stream(count_Arr).forEach(System.out::println);
        Character[] res = new Character[arr.length()];

        for(int i=0;i<arr.length();i++){
            int index = arr.charAt(i);
            int val = count_Arr[index-96];
            res[val-1] = arr.charAt(i);
            count_Arr[index-96] = val-1;
        }
        String result = "";
        for(char ch: res)
            result+=ch;
        return result;
    }
}
