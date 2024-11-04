package com.gfg.easy;

public class BinarySearchInForest {
    public static void main(String[] args) {
        int[] tree = {2, 3, 5, 2, 4};
//        int height = find_height(tree, tree.length, 6);
        int height = binaryTreeSolution(tree, tree.length, 6);
        System.out.println(height);
    }

    public static int binaryTreeSolution(int[] tree, int n, int k) {
        int high = Integer.MIN_VALUE;
        int low = 0;
        for (int t : tree) {
            if (high < t)
                high = t;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (findSum(tree, mid) == k) {
                return mid;
            } else if (findSum(tree, mid) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int findSum(int[] tree, int mid) {
        int sum = 0;
        for (int t : tree) {
            if (t > mid) {
                sum += t - mid;
            }
        }
        return sum;
    }

    static int find_height(int[] tree, int n, int k) {
        int max = Integer.MIN_VALUE;
        for (int t : tree) {
            if (max < t)
                max = t;
        }

        int sum = 0;
        int counter = max - 1;
        while (counter > 0) {
            for (int t : tree) {
                if (t > counter) {
                    sum += t - counter;
                }
            }
            if (sum == k)
                return counter;
            counter--;
            sum = 0;
        }
        return -1;
    }
}
