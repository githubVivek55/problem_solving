package com.gfg.easy;

public class MinFlips {
    public static void main(String[] args) {
        // String S = "01010010101011111111111110000000000000";
        // 01010010101011111111111110000000000000
        String S = "01010010101011111111111110000000000000";
        /*
        0101
         */
        int i = minFlips(S);
        System.out.println(i);
    }

    public static int minFlips(String S) {
        int minAteven = 0;
        int minAtodd =0;

        for(int i=0;i<S.length();i++){
            if(i%2==0){
                if(S.charAt(i)!='0'){
                    minAteven++;
                }else {
                    minAtodd++;
                }
            }else {
                if(S.charAt(i)!='1'){
                    minAteven++;
                }else {
                    minAtodd++;
                }
            }
        }
        return Math.min(minAteven,minAtodd);
    }
}
