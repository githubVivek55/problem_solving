package com.gfg.array;

import java.util.HashMap;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k = 15;
        int i = lenOfLongSubarr(arr, arr.length, k);
        System.out.println(i);
    }

    public static int lenOfLongSubarr(int[] A, int N, int K) {
        // Complete the function
        HashMap<Long, Integer> map = new HashMap<>();
        long sum = 0;
        int len = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
            if (sum == K) {
                len = i + 1;
            }
            long sub = sum - K;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sub)) {
                int len1 = i - map.get(sub);
                len = Math.max(len, len1);
            }

        }

        return len;
    }
}
