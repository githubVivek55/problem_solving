package com.vwake.problems;

public class RotateTwoPlaces {
    public static void main(String[] args) {
        String str1 = "gee";
        String str2 = "gee";
        if(str1.length()<=2){
            System.out.println(str1.equals(str2));
            return;
        }
        String ans1  = str1.substring(str1.length()-2)+str1.substring(0,str1.length()-2);
        String ans2  = str1.substring(2)+str1.substring(0,2);
        if(ans1.equals(str2)){
            return;
        }else if(ans2.equals(str2)){
            return;
        }

    }

    private static void rotateTwoPlaces(char[] arr, int dir) {
        int count = 2;
        char prev = arr[0];
        //mazona
        //azonam
        while (count > 0) {
            if (dir == -1) {
                prev = arr[arr.length - 1];
                for (int i = arr.length - 1; i >= 0; i--) {
                    if (i - 1 == -1) {
                        arr[arr.length-1] = prev;
                    } else {
                        char temp = arr[i - 1];
                        arr[i - 1] = prev;
                        prev = temp;
                    }
                }
            }else{
                for (int i = 0; i < arr.length; i++) {
                    if (i + 1 == arr.length) {
                        arr[0] = prev;
                    } else {
                        char temp = arr[i + 1];
                        arr[i + 1] = prev;
                        prev = temp;
                    }
                }
            }
            count--;
        }
    }
}
