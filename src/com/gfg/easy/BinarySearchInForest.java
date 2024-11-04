package com.gfg.easy;

public class BinarySearchInForest {
    public static void main(String[] args) {
        int n = 5, k = 6;
        int[] tree = {2, 3, 5, 2, 4};
        int height = find_height(tree, tree.length, 6);
        System.out.println(height);
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
