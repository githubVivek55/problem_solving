package com.gfg.array;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = 7;
        int[] res = stockSpan(price, n);
    }

    public static int[] stockSpan(int[] price, int n) {
        int[] calculateSpan= new int[n];
        Stack<Integer> st= new Stack<Integer>();
        st.push(0);
        calculateSpan[0]=1;

        for(int i=1; i<n; i++){
            int dayCount=0;

            if(price[i]>=price[st.peek()]){
                while(!st.isEmpty() && price[i]>=price[st.peek()]){
                    st.pop();
                }
            }
            if(st.isEmpty()){
                dayCount= i+1;
            }else{
                dayCount= i-st.peek();
            }

            st.push(i);


            calculateSpan[i]=dayCount;
        }

        return calculateSpan;
    }
}
