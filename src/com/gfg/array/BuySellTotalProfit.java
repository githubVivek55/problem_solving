package com.gfg.array;

public class BuySellTotalProfit {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        int[] prices2 = {4, 2, 2, 2, 4};
        int i = maximumProfit(prices2);
        System.out.println(i);
    }
    public static int maximumProfit(int[] prices) {
        // code here
        int total =0,ls=0,b=0;
        int i=0;
        int n=prices.length;
        while (i<(n-1)){
            if(prices[i+1]>prices[ls]){
                i++;
            }else{
                total+=prices[ls]-prices[b];
                i++;
                b=i;
            }
            ls=i;
        }
        if(prices[ls]>prices[b]){
            total+=prices[ls]-prices[b];
        }
        return total;
    }
}
