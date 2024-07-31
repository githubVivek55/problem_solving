package com.gfg.Hash;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class LRUCache {
    private static int cap;
    private static final HashMap<Integer, Integer> cache = new LinkedHashMap<>();
    private static final HashMap<Integer, Long> timestamp = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hp\\Downloads\\fileInput.txt";
        String inputContent = readFile(path);
        System.out.println(inputContent);
        String[] arr = inputContent.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("GET")){
                i+=1;
                int i1 = get(Integer.parseInt(arr[i]));
                System.out.println(i1);
            } else if (arr[i].equals("SET")) {
                i+=1;
                int keyi = i;
                i+=1;
                int vali = i;
                set(keyi,vali);
            }
        }
        cap = 2;
    }

    public static String readFile(String path) throws IOException {
        Path filePath = Paths.get(path);
        return String.join(" ", Files.readAllLines(filePath));
    }

    public LRUCache(int cap) {
        LRUCache.cap = cap;
    }

    public static int get(int key) {
        timestamp.computeIfPresent(key, (k, v) -> System.nanoTime());
        return cache.getOrDefault(key, -1);
    }

    public static void set(int key, int value) {
        if (cache.size() >= cap) {
            int replace_key = getLRUKey();
            cache.remove(replace_key);
            timestamp.remove(replace_key);
        }
        cache.put(key, value);
        timestamp.put(key, System.nanoTime());
    }

    private static int getLRUKey() {
        return timestamp.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(-1);
    }
}
