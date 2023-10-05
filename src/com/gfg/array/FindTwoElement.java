package com.gfg.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTwoElement {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int[] twoElement = findTwoElement(arr, arr.length);
        for (int a : twoElement) {
            System.out.println(a);
        }
    }

    static int[] findTwoElement(int[] arr, int n) {
        int[] temp
                = new int[n]; // Creating temp array of size n

        int repeatingNumber = -1;
        int missingNumber = -1;

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }
        int[] result = new int[2];
        result[0] = repeatingNumber;
        result[1] = missingNumber;
        return result;
    }
}
