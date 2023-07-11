package com.vwake.problems;

public class MaxNoOf1s {
    public static void main(String[] args) {
        int N = 2, M = 2;
        int[][] Mat = {{0, 1}, {1, 1}};
        int max = -1;
        int row = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < M; j++) {
                if (Mat[i][j] == 1) {
                    count = M - j;
                    break;
                }
            }
            if (count > max) {
                max = count;
                row = i;
            }
        }
        System.out.println(row);
    }
}
