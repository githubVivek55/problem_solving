package com.vwake.problems;

public class MetrixTranspose {
    public static void main(String[] args) {
        int N = 4;
        int mat[][] = {{1,2},{-9,-2}};

        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                if(i!=j){
                    int temp = mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
