package com.vwake.problems;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 2, 7, 6, 1, 4, 2, 3};
        long result = solution(arr, arr.length);
        System.out.println(result);
    }

    public static long solution(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int leftMax = arr[left];
        int rightMax = arr[right];
        long result = 0;
        while (left < right) {
            if (leftMax <= rightMax) {
                left++;
                leftMax = Math.max(leftMax, arr[left]);
                result += leftMax - arr[left];
            }
            if (leftMax > rightMax) {
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                result += rightMax - arr[right];
            }
        }
        return result;
    }
}
