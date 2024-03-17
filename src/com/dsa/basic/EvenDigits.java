package com.dsa.basic;

public class EvenDigits {

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		
		int ans = findNumbers(nums);
		System.out.println(ans);
	}
	
	static  int findNumbers(int[] nums) {
		 int count =0;
	        for(int i = 0 ; i< nums.length ; i++){
	        	if(even(nums[i])) {
	        		count++;
	        	}
	        }
	        return count;
	    }
	 
	static int digits(int num) {
		
		int count = 0;
		 while(num!=0) {
			 count++;
			 num = num/10;
			 
		 }
		 return count;
	 }
	 
	static  boolean even(int n) {
		  int numberOfDigits = digits(n);
		 if(numberOfDigits%2==0) {
			 return true;
		 }
		 else {
			return false;
		}
	 }
}
