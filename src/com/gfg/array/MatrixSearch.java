package com.gfg.array;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {
                {18 ,21 ,27, 38, 55, 67},

            };
        int i = matSearch(mat, 1, 6, 60);
        System.out.println(i);
    }

    public static int matSearch(int[][] mat, int N, int M, int X) {
        int i=0;
        while (i<N) {
            if (X <= mat[i][M - 1]) {
                for (int k : mat[i]) {
                    if (k == X) {
                        return 1;
                    }
                }
            }
            i++;
        }
        return 0;
    }
}
