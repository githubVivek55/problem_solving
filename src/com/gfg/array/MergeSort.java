package com.gfg.array;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        mergeSort(arr, 0, arr.length - 1);

    }

    static void merge(int[] arr, int l, int m, int r) {
        int left = l;
        int right = m + 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (left <= m && right <= r) {
            if (arr[left] < arr[right]) {
                res.add(arr[left]);
                left++;
            } else {
                res.add(arr[right]);
                right++;
            }
        }
        while (left <= m) {
            res.add(arr[left]);
            left++;
        }
        while (right <= r) {
            res.add(arr[right]);
            right++;
        }
        for (int i = l; i <= r; i++) {
            arr[i] = res.get(i - l);
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        } else {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
