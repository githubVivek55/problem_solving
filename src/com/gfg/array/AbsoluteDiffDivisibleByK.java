package com.gfg.array;

public class AbsoluteDiffDivisibleByK {

    /*

    Convert each elements (A[i]) of the array to ((A[i]+K)%K)
    Use hashing teching technique to store the number of times (A[i]%K) occur in the array
    Now, if an element A[i] occurs x times in the array then add x*(x-1)/2

     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        long l = countPairs(arr.length, arr, 2);
        System.out.println(l);
    }

    static long countPairsOptimized(int n, int[] arr, int k) {
        int[] rem = new int[k];
        for (int i = 0; i < k; i++) {
            rem[arr[i]%k]+=1;
        }
        int count=0;
        for(int i=0;i<rem.length;i++){
            count+=(rem[i]*(rem[i]-1))/2;
        }
        return count;
    }

    static long countPairs(int n, int[] arr, int k) {
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[j] - arr[i]);
                if (diff % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
