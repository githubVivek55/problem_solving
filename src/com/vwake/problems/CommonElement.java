package com.vwake.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        int[] v1 = {3, 4, 2, 2, 4};
        int[] v2 = {3, 2, 2, 7};
        System.out.println(common_element(v1, v2));
    }

    public static ArrayList<Integer> common_element(int[] v1, int[] v2) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(v1);
        Arrays.sort(v2);

        int i = 0, j = 0;
        while (i < v1.length && j < v2.length) {
            if (v1[i] == v2[j]) {
                res.add(v1[i]);
                i++;
                j++;
            } else if (v1[i] < v2[j]) {
                i++;
            } else if (v1[i] > v2[j]) {
                j++;
            }
        }
        return res;
    }
}
