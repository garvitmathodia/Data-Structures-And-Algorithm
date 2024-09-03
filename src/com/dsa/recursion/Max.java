package com.dsa.recursion;

public class Max {

    public static void main(String[] args) {
        int[] arr = {22, 33, 4, 19, 7};
        int ans = findmax(arr, 0);
        System.out.println(ans);
    }

    public static int findmax(int[] arr , int index){
        if(index==arr.length) return Integer.MIN_VALUE;
        int maxi = findmax(arr, index+1);
        return Math.max(maxi,arr[index]);
    }
}
