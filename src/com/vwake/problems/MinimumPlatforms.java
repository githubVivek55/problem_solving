package com.vwake.problems;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumPlatforms {
    public static void main(String[] args) {
//        Path path = Paths.get("files/minimumPlatforms.txt");
//        try(Stream<String> lines = Files.lines(path);){
//            List<String> collect = lines.skip(1).flatMap(line -> Pattern.compile(" ").splitAsStream(line)).collect(Collectors.toList());
//            System.out.println(collect.size());
//            //Long[] arr1 = collect.subList(0,collect.size()/2).toArray(Long[]::new);
//            Long[] dep1 = collect.subList(collect.size()/2, collect.size()).toArray(Long[]::new);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};


        int res = findPlatform(arr, dep, arr.length);
        System.out.println("Result=" + res);


    }

    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count=1;
        for (int i=1 , j=0;i<arr.length;){
            if (arr[i]>dep[j]){
                i++;
                j++;
                continue;
            }
            else{
                i++;
                count++;
            }
        }
        return count;
    }

}
