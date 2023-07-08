package com.vwake.problems;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int r = 3, c = 5;
        int matrix[][] = {{6, 6, 2, 28, 2},
                {12 ,26 ,3 ,28, 7},
                {22 ,25, 3, 4, 23}};

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(left+"="+right+" "+top+"="+bottom);
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(res);
    }
}
