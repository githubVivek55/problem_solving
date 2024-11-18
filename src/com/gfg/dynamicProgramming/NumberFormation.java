package com.gfg.dynamicProgramming;

public class NumberFormation {
    public static void main(String[] args) {
        int sum = getSum(4, 4, 2);
        System.out.println(sum);
    }

    public static int getSum(int X, int Y, int Z) {
        long ans = 0;
        for (int i = 0; i <= X; i++) {
            for (int j = 0; j <= Y; j++) {
                for (int k = 0; k <= Z; k++) {
                    String s = "4".repeat(i) + "5".repeat(j) + "6".repeat(k);
                    if (!s.isEmpty()) {
                        ans += permutation(s, "") % 1000000007;
                    }
                }
            }
        }

        return (int) ans%1000000009;
    }

    public static long permutation(String str, String ans) {
        if (str.length() == 0) {
            return Long.parseLong(ans);
        }
        long sum = 0;
        boolean alpha[] = new boolean[3];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            int i1 = Integer.parseInt(String.valueOf(ch)) - 4;
            if (!alpha[i1]) {
                long arg = Long.parseLong(ans + ch) % 1000000007;
                sum = (sum + permutation(ros, String.valueOf(arg)));
            }
            alpha[i1] = true;
        }
        return sum;
    }
}
