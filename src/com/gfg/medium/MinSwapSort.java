package com.gfg.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * find min number of swap required to sort given array
 * time complexity O(nlogn)
 * space complexity O(n)
 *          * [2,8,5,4]
 *          * [[2,0],[8,1],[5,2],[4,3]]
 *          sort array based on value
 *          [[2,0],[4,3],[5,2],[8,1]]
 *          Bool array
 *          [false,false,false,false]
 *
 */
public class MinSwapSort {
    public static void main(String[] args) {
        int[] nums = {13,1,5,3,6,11,10};
        int res = minSwap(nums);
        System.out.println(res);
    }
    public static int minSwap(int[] nums){
        List<Pair<Integer,Integer>> pairArr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Pair<Integer,Integer> pair = new Pair<>();
            pair.setKey(nums[i]);
            pair.setValue(i);
            pairArr.add(pair);
        }
        pairArr.sort(Comparator.comparing(Pair::getKey));
        for(Pair<Integer,Integer> p: pairArr){
            System.out.println(p.getKey());
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i!=pairArr.get(i).getValue()){
                while(i!=pairArr.get(i).getValue()){
                    Pair<Integer, Integer> pair = pairArr.get(pairArr.get(i).getValue());
                    pairArr.set(pairArr.get(i).getValue(),pairArr.get(i));
                    pairArr.set(i,pair);
                    count++;
                }
            };
        }
        return count;
    }
    public static class Pair<K,V>{
        private K key;
        private V value;

        public void setValue(V value){
            this.value = value;
        }
        public V getValue(){
            return value;
        }
        public void setKey(K k){
            key=k;
        }
        public K getKey(){
            return this.key;
        }
    }
}
