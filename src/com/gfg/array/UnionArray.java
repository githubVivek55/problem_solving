package com.gfg.array;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,3};
        System.out.println(doUnion(arr1,arr1.length,arr2,arr2.length));
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        int max = Integer.MIN_VALUE;
        for(int i: a){
            if(i>max){
                max=i;
            }
        }
        for(int j: b){
            if(j>max){
                max=j;
            }
        }

        int[] res = new int[max+1];

        for (int i:a){
            res[i]++;
        }
        for (int i:b){
            res[i]++;
        }
        int count=0;
        for(int i: res){
            if(i>0){
                count++;
            }
        }
        return count;
    }
}
