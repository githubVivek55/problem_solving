package com.vwake.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueRowMatrix {
    public static void main(String[] args) {
        int row = 3, col = 4;
        int[][] a = {{1, 1, 0, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}};
        Set<Long> unique = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 0; i < row; i++) {
            String s = "";
            for (int j = 0; j < col; j++) {
                s += a[i][j];
            }
            if(
            unique.add(
                    Long.parseLong(s, 2))){
                ArrayList<Integer> l = Arrays.stream(a[i]).boxed().collect(Collectors.toCollection(ArrayList::new));
                ans.add(l);
            }
        }
        System.out.println(ans);
        System.out.println(Long.parseLong("000010111110000100110010001010010110101",2));
//        return ans;
    }
}
