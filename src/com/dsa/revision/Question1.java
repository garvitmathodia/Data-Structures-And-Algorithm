package com.dsa.revision;

import java.util.*;
class Question1 {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       long[] arr = new long[size];
       for(int i = 0 ; i<size ; i++){
        arr[i] = sc.nextLong();
       }
       Stack<Integer> s = new Stack<>();
       long[] arr1 = helper(arr , s);

       while(s.size() != 0){
        s.pop();
       }

       long[] arr2 = helper1(arr , s);

       for(int i = 0 ; i<arr.length ; i++){
        arr[i] = arr1[i] + arr2[i];
        System.out.print(arr[i]+" ");
       }
    }
    public static long[] helper(long[] arr , Stack<Integer> s){
        long[] ans = new long[arr.length];
        int i = arr.length-2;
        ans[i+1] = -1;
        s.push(i+1);
        while(i>=0){
            if(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                if(s.isEmpty()){
                    ans[i] = -1;
                    s.push(i);
                    i--;
                }else{
                    s.pop();
                }                
            }else{
                if(!s.isEmpty()){
                    ans[i] = s.peek()+1;
                    s.push(i);
                    i--;
                }else{
                    ans[i] = -1;
                    s.push(i);
                    i--;
                }
                
            }
        }
        return ans;
    }

    public static long[] helper1(long[] arr , Stack<Integer> s){
        long[] ans = new long[arr.length];
        int i = 1;
        ans[i-1] = -1;
        s.push(i-1);
        while(i<arr.length){
            if(!s.isEmpty() && arr[i]>=arr[s.peek()]){
                if(s.isEmpty()){
                    ans[i] = -1;
                    s.push(i);
                    i++;
                }else{
                    s.pop();
                }                
            }else{
                if(!s.isEmpty()){
                    ans[i] = s.peek()+1;
                    s.push(i);
                    i++;
                }else{
                    ans[i] = -1;
                    s.push(i);
                    i++;
                }
                
            }
        }
        return ans;
    }

}
