package com.dsa.basic;

public class WealthLeet {
 public static void main(String[] args) {
	int[][] accounts = {{1,5},{7,3},{3,5}};
	
	int wealth = maximumWealth(accounts);
	
	System.out.println(wealth);
	
}
 
 public static int maximumWealth(int[][] accounts) {
     int max = Integer.MIN_VALUE;
     for(int i = 0 ; i<accounts.length ; i++){
         int rowsum = 0;
         for(int j = 0 ; j<accounts[i].length ; j++){
             rowsum = rowsum+accounts[i][j];
         }
         if(max<rowsum){
             max = rowsum;
         }
     }
     return max;
 }
 
 
}
