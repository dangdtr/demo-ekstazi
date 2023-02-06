package com.uet.app;


public class Calculation {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * minArray find min value in array
     *
     * @param arr para.
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int Ans = (int) 1e9;
        for (int j : arr) {
            Ans = Math.min(Ans, j);
        }
        return Ans;
    }


}