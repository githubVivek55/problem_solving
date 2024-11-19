package com.gfg.dynamicProgramming;

public class NumberFormation {
    public static void main(String[] args) {
        int sum = getSum(4, 4, 2);
        System.out.println(sum);
    }

    public static int getSum(int X, int Y, int Z) {
        int N = 101;
        int mod = (int)1e9 + 7;
        long[][][] exactsum = new long[N][N][N];
        long[][][] exactnum = new long[N][N][N];
        int ans = 0;
        exactnum[0][0][0] = 1;
        for (int i = 0; i <= X; ++i)
        {
            for (int j = 0; j <= Y; ++j)
            {
                for (int k = 0; k <= Z; ++k)
                {
                    if (i > 0)
                    {
                        exactsum[i][j][k]
                                += (exactsum[i - 1][j][k] * 10
                                + 4 * exactnum[i - 1][j][k]) % mod;

                        exactnum[i][j][k]
                                += exactnum[i - 1][j][k] % mod;
                    }
                    if (j > 0)
                    {
                        exactsum[i][j][k]
                                += (exactsum[i][j - 1][k] * 10
                                + 5 * exactnum[i][j - 1][k]) % mod;

                        exactnum[i][j][k]
                                += exactnum[i][j - 1][k] % mod;
                    }
                    if (k > 0)
                    {
                        exactsum[i][j][k]
                                += (exactsum[i][j][k - 1] * 10
                                + 6 * exactnum[i][j][k - 1]) % mod;

                        exactnum[i][j][k]
                                += exactnum[i][j][k - 1] % mod;
                    }

                    ans += exactsum[i][j][k] % mod;
                    ans %= mod;
                }
            }
        }
        return ans;

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
