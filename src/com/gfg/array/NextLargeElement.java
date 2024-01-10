package com.gfg.array;

import java.util.Arrays;
import java.util.Stack;

public class NextLargeElement {
    public static void main(String[] args) {
        long[] arr = {6, 8, 0, 1, 3};
        long[] nextLargeArr = getNextLargeArr(arr, arr.length);
        System.out.println(Arrays.toString(nextLargeArr));
    }

    public static long[] getNextLargeArr(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        long[] result = new long[n];
        result[n-1]=-1;
        stack.push(arr[n-1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            long out = stack.empty()?-1:stack.peek();
            result[i]=out;
            stack.push(arr[i]);
        }
        return result;
    }
}
