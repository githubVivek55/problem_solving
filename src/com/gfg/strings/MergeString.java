package com.gfg.strings;

public class MergeString {
    public static void main(String[] args) {
        String one = "Hello";
        String two = "Bye";
        String merge = merge(one, two);
        System.out.println(merge);
    }

    public static String merge(String S1, String S2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < S1.length() && j < S2.length()) {
            sb.append(S1.charAt(i));
            sb.append(S2.charAt(j));
            i++;
            j++;
        }

        if (i < S1.length()) {
            while (i < S1.length()) {

                sb.append(S1.charAt(i));
                i++;
            }
        }
        if (j < S2.length()) {
            while (j < S2.length()) {
                sb.append(S2.charAt(j));
                j++;
            }
        }
        return sb.toString();
    }
}
