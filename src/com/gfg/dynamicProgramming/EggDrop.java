package com.gfg.dynamicProgramming;

public class EggDrop {
    public static void main(String[] args) {
        eggDrop(2, 4);
    }

    public static int eggDrop(int n, int k) {
        if (k == 0 || k == 1) {
            return k;
        }
        if (n == 1) {
            return k;
        }
        int min = Integer.MAX_VALUE, x, res;
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));
            if (res < min)
                min = res;
        }
        return min + 1;
    }
}
