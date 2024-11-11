package com.gfg.array;

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 3, 6, 9, 11};
        int[] prices4 = {6, 9, 5, 3, 2, 6, 6, 4};
        int i = maximumProfit(prices4);
        System.out.println(i);
    }

    public static int maximumProfit(int[] prices) {
        // Code here
        int n = prices.length;
        int diff = 0;
        int b = 0;
        int s = 1;

        while (s < n && b < n) {
            if (prices[s] < prices[b]) {
                b++;
                s = b + 1;
            } else {
                if ((prices[s] - prices[b] > diff)) {
                    diff = prices[s] - prices[b];
                }
                s++;
            }
        }
        return diff;
    }
}
