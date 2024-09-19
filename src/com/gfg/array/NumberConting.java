package com.gfg.array;

import java.util.ArrayList;
import java.util.List;

public class NumberConting {
    public static void main(String[] args) {
        List<Integer> integers = filterByDigits(List.of(97 ,100, 50, 69));
        integers.forEach(System.out::println);
    }

    public static List<Integer> filterByDigits(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            int temp = num;
            boolean flag = true;
            while (temp > 0) {
                int d = temp % 10;
                if (d == 1 || d == 2 || d == 3) {
                    temp = temp / 10;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                result.add(num);
        }
        return result.isEmpty() ? List.of(-1) : result;
    }
}
