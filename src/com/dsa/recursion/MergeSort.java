package com.dsa.recursion;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {		
		int[] arr = {4,3,2,1};
		int[] ans = merge(arr);
		System.out.println(Arrays.toString(ans));
	}
	
	static int[] merge(int[] arr) {
		 if(arr.length==1) {
			 return arr;
		 }
		 
		 int mid = arr.length/2;
		 
		 int[] left = merge(Arrays.copyOfRange(arr , 0 , mid)) ;
		 int[] right = merge(Arrays.copyOfRange(arr , mid , arr.length)) ;
		 
		 return sort(left , right);
	}
	
	static int[] sort(int[] first , int[] last) {
		int[] mix = new int[first.length+last.length];
		int k =0;
		int i = 0;
		int j = 0;
		while(i<first.length && j<last.length) {
			if(first[i]>=last[j]) {
				mix[k] = last[j];
				k++;
				j++;
			}
			else{
				mix[k] = first[i];
				i++;
				k++;
			}
		}
		while(i<first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}
		
		while(j<last.length) {
			mix[k] = last[j];
			k++;
			j++;
		}
		return mix;
	}
}
