package com.gfg.strings;

import java.util.Arrays;

public class LongestPalindrom {
    public static void main(String[] args) {
        String s = "aaaabbaa";
        String s1 = longestPalin(s);
        System.out.println(s1);
    }

    static String longestPalin(String S) {
        String maxL = "";
        for (int i = 0; i < S.length(); i++) {
            for (int j = i+maxL.length(); j <= S.length(); j++) {
                String sub = S.substring(i, j);
                if (isPalindrom(sub) && maxL.length() < sub.length()) {
                    maxL = sub;
                }
            }
        }
        return maxL;
    }

    static Boolean isPalindrom(String in) {
        for (int i = 0, j = in.length() - 1; i <= j; i++, j--) {
            if (in.charAt(i) != in.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
