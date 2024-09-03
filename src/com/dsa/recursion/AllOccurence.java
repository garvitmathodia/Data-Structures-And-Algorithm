package com.dsa.recursion;

public class AllOccurence {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4, 8};
        int[] ans = findFirst(arr, 0 , 3 , 0);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] findFirst(int[] arr , int index, int d , int count){
        if(index==arr.length) return new int[count];

        if(arr[index]==d){
            int[] a = findFirst(arr, index+1, d, count+1);
            a[count] = index;
            return a;
         }else{
            int[] a = findFirst(arr, index+1, d, count);
            return a;
         }

    }
}
