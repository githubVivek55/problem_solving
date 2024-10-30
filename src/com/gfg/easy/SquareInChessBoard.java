package com.gfg.easy;

public class SquareInChessBoard {
    public static void main(String[] args) {
        Long l = squaresInChessBoard(5L);
        System.out.println(l);
    }
    static Long squaresInChessBoard(Long N) {
        long sum=0;
        while(N>0){
            sum+=N*N;
            N--;
        }
        return sum;
    }
}
