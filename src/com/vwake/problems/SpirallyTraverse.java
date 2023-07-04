package com.vwake.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class SpirallyTraverse {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int xmax = matrix[0].length-1;
        int ymax= matrix.length-1;
        int xmin=0;
        int ymin=0;
        boolean flag=true;
        int x=0,y=0;
        while(flag){
            if(x==xmax && y>0){
                y--;
            }else if(y<ymax){
                y++;
            }else if(x<xmax){
                x++;
            }
        }
        return null;
    }
}
