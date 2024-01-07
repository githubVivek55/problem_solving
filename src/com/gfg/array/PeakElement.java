package com.gfg.array;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {479,758, 315, 472, 730, 101, 460, 619};
        System.out.println(peakElement(arr, arr.length));
    }

    public static int peakElement(int[] arr, int n) {
        int j = -1, k = 1;
        if(n==1){
            return 0;
        }

        for (int i = 0; i < n; i++) {
            if (j == -1 && arr[i] > arr[k]) {
                return i;
            } else if (k == n && arr[i] > arr[j]) {
                return i;
            } else if (i > 0 && k < n) {
                if (arr[i] > arr[j] && arr[i] > arr[k])
                    return i;
            }
            j++;
            k++;
        }
        return n-1;
    }
}
