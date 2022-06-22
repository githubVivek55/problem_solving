package com.vwake.problems;

public class CountInversion {
    public static void main(String[] args) {
        long[] arr = {10, 10, 10};
        long N = arr.length;
        long res = inversionCount(arr,N);
        System.out.println("Output is ="+res);
    }
    static long inversionCount(long arr[], long N)
    {
        long res=0;
        sort(arr,0,(int)N-1,res);
        return res;
    }
    static void sort(long[] arr, int l,int r,long res){
        if(l<r){
            int m = l+(r-l)/2;
            sort(arr,l,m,res);
            sort(arr,m+1,r,res);
            merge(arr, l,m,r,res);
        }
    }
    static void merge(long[] arr,int l, int m, int r,long res){
        int n1 = m-l+1;
        int n2 = r-m;
        long[] L = new long[n1];
        long[] R =new long[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }

        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }
        int i=0,j=0;
        int k=l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
