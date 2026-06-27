package com.gfg.dynamicProgramming;

class PerfectSum {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3 };
        Integer target = 4;
        int result = getPerfectSum(arr, target);
        System.err.println(result);
    }

    public static Integer getPerfectSum(Integer[] arr, int target) {
        int n = arr.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (target + 1); j++) {
                dp[i][j] = dp[i - 1][j];
                if (arr[i - 1] <= j) {
                    dp[i][j] += dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][target];
    }
}