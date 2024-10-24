package com.gfg.array;

public class RectangleOveralpping {
    public static void main(String[] args) {
        int[] l1 = {6,70};
        int[] r1 = {67,33};
        int[] l2 = {17,77};
        int[] r2 = {88,-25};

        int i = doOverlap(l1, r1, l2, r2);
        System.out.println(i);
    }
    static int doOverlap(int[] L1, int[] R1, int[] L2, int[] R2) {
        // code here
        int x1 = L1[0];
        int x2 = R1[0];
        int x3 = L2[0];
        int x4 = R2[0];
        int y1 = L1[1];
        int y2 = R1[1];
        int y3 = L2[1];
        int y4 = R2[1];

        if(x3>x2 || x1>x4){
            return 0;
        }
        if(y2>y3 || y4>y1){
            return 0;
        }


        return 1;
    }
}
