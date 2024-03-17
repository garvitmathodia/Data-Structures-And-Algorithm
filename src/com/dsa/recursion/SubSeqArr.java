package com.dsa.recursion;

import java.util.ArrayList;

public class SubSeqArr {
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = 3;
		ArrayList<Integer> list = new ArrayList<>();
		printF(0 , list , arr , n);
	}
	
	static void printF(int ind , ArrayList<Integer> list , int[] arr , int n) {
		if(ind == n) {
			for(int i = 0 ; i<list.size() ; i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			return;
		}
		
		list.add(arr[ind]);
		printF(ind+1, list, arr, n);
		list.remove(list.size()-1);
		printF(ind+1, list, arr, n);
	}
}
