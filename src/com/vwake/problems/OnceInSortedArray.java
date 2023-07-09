package com.vwake.problems;

public class OnceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 50, 50, 65,65};
        int low =0;
        int n = arr.length;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid%2==0){
                if(mid<n-1 && arr[mid]==arr[mid+1]){
                    low=mid+2;
                }else{
                    high=mid-1;
                }
            }else{
                if(mid>=0 && arr[mid]==arr[mid-1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        System.out.println(arr[low]);
    }
}
