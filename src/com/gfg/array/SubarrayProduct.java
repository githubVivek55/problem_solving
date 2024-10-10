package com.gfg.array;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SubarrayProduct {
    public static void main(String[] args) throws IOException {
        long[] arr = {1, 2, 3, 4};
        Path path = Path.of("D:/dev/java_workspace/play_ground/files/arrProd.txt");
        String s = Files.readString(path);
        long[] arr2 = Arrays.stream(s.split(" "))
                .mapToLong(Long::parseLong).toArray();
//        Arrays.stream(arr2).boxed().forEach(System.out::println);
        long l = countSubArrayProductLessThanK(arr, arr.length, 10);
        System.out.println(l);
    }

    public static long countSubArrayProductLessThanK(long[] a, int n, long k) {

        long count = 0;
        int i = 0, j = 0;
        long mul = 1;
        /*
            {1,2,3,4} , k =10
             1
             1,2
             1,2,3      =2-0+1=3
             1,2,3,4    =NO
               2,3      =2-1 =1+1 =2
               2,3,4    =NO
                 3      =2-2+1 =1
                 3,4    =NO
                   4    =3-3+1 = 1
         */
        while (i < n) {
            mul *= a[i];
            while (j <= i && mul >= k) {
                mul /= a[j];
                j++;
            }
            count += (i - j) + 1;
            i++;
        }
        return count;
    }
}
