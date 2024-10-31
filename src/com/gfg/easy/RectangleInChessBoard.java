package com.gfg.easy;

public class RectangleInChessBoard {
    public static void main(String[] args) {
        Long l = rectanglesInChessBoard(4L);
        System.out.println(l);
    }
    static Long rectanglesInChessBoard(Long N) {
        // code here
        // 2x1
        // 3x1
        // 2x3
        //
        long count=(N*N*(N+1)*(N+1))/4 - (N*(N+1)*(2*N+1))/6;

        return count;
    }
}
