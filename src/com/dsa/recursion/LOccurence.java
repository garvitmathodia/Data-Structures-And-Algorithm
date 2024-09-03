package com.dsa.recursion;

public class LOccurence {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 9, 8, 3, 2, 6, 2, 4, 8};
        int ans = findFirst(arr, 0 , 2);
        System.out.println(ans);
    }

    public static int findFirst(int[] arr , int index, int d){
        if(index==arr.length) return -1;
        
        int i = findFirst(arr, index+1, d);
        
        if(i==-1){
            if(arr[index]==d){
                return index;
            }else{
                return -1;
            }
            
        }else{
            return i;
        }
        
    }
}
