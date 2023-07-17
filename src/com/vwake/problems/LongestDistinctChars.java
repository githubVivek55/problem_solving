package com.vwake.problems;

public class LongestDistinctChars {
    public static void main(String[] args) {
        String S = "ge";
        int start = 0;
        int end = 1;
        int next = 1;
        int ret = 0;
        while (end <= S.length()) {
            String sub = S.substring(start, end);
            if (next < S.length()) {
                char ch = S.charAt(next);
                if (sub.indexOf(ch) > -1) {
                    start++;
                    end=start;
                    next=end;
                }
                next++;
            }
            int length = sub.length();
            if (length > ret) {
                ret = length;
            }
            end++;
        }
        System.out.println(ret);
    }
}
