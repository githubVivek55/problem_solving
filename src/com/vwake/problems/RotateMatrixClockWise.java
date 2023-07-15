package com.vwake.problems;

public class RotateMatrixClockWise {
    public static void main(String[] args) {
        int M = 4, N = 4;
        int[][] a = {
                {1, 2, 3, 4},
                {2, 3, 3, 5},
                {7, 8, 9, 6},
                {7, 8, 9, 6}
        };
        int top = 0, left = 0, right = N - 1, bottom = M - 1;

        while (top < bottom && left < right) {
            int prev = a[top][left];
            for (int i = left; i < right; i++) {
                int t = a[top][i + 1];
                a[top][i + 1] = prev;
                prev = t;
            }
            for (int i = top; i < bottom; i++) {
                int t = a[i + 1][right];
                a[i + 1][right] = prev;
                prev = t;
            }
            for (int i = right; i > left; i--) {
                int t = a[bottom][i - 1];
                a[bottom][i - 1] = prev;
                prev = t;
            }
            for (int i = bottom; i > top; i--) {
                int t = a[i - 1][left];
                a[i - 1][left] = prev;
                prev = t;
            }
            top++;
            bottom--;
            left++;
            right--;
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
