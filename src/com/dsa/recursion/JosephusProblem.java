package com.dsa.recursion;

public class JosephusProblem {

    public static void main(String[] args) {
        int n = 7;
        int k = 4;
        System.out.println(helper(n , k));
    }

    public static int helper(int n , int k){
        if(n==1){
            return 0;
        }

        int x = helper(n-1, k);
        int ans = (x+k)%n;
        return ans;
    }
}
