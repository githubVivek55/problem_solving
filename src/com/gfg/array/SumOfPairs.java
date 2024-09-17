package com.gfg.array;

import java.util.HashMap;

public class SumOfPairs {
    public static void main(String[] args) {
        System.out.println(9 % 6);
        int[] nums = {11, 6, 7, 13, 13, 6};
        int[] num2 = {9, 5, 7, 3};
        int[] num3 = {6, 14, 12, 14};
        int[] num4 = {10, 4, 2, 2};
        int k = 6;
        boolean b = canPair(num2, k);
        System.out.println(b);
    }

    public static boolean canPair(int[] nums, int k) {
        // Code here
        if (nums.length % 2 != 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        //r1+r2=k
        //{ 9,5,7,3 }
        for (int num : nums) {
            int r1 = num % k;
            if (r1 == 0) {
                if (map.containsKey(0)) {
                    if (map.get(0) == 1)
                        map.remove(0);
                    else
                        map.put(0, map.get(0) - 1);
                } else {
                    map.put(0, map.getOrDefault(0, 0) + 1);
                }
            } else if (!map.containsKey(k - r1)) {
                map.put(r1, map.getOrDefault(r1, 0) + 1);
            } else {
                if (map.get(k - r1) == 1)
                    map.remove(k - r1);
                else
                    map.put((k - r1), map.get(k - r1) - 1);
            }
        }
        return map.isEmpty();
    }
}
