package com.gfg.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int  A[] = {3,3,3};
        int  B[] = {3,3,3};
        int  C[] = {3,3,3};

        ArrayList<Integer> result = commonElements(A, B, C, A.length, B.length, C.length);
        System.out.println(result);
    }

    public static ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) {
        int i = 0, j = 0,k=0;
        ArrayList<Integer> res = new ArrayList<>();
        int last = 0;
        while (i < n1 && j < n2 && k<n3) {
            if (a[i] == b[j] && b[j]==c[k]) {
                if (last != a[i]) {
                    res.add(a[i]);
                    last =a[i];
                }
                j++;
                i++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            }else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        return res;
    }
}
