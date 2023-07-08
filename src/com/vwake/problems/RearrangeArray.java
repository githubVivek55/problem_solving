package com.vwake.problems;

public class RearrangeArray {
    public static void main(String[] args) {
        long arr[] = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int start = 0, end = n - 1;
        long max = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[end] % max) * max;
                end--;
            } else {
                arr[i] += (arr[start] % max) * max;

                start++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }

    }
}
