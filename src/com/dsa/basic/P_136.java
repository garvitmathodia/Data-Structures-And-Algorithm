package com.dsa.basic;

import java.util.HashSet;
import java.util.Set;

public class P_136 {
public static void main(String[] args) {
	//brute force approach 0(n)
	int arr[] = {1,1,2,2,3};
	Set<Integer> set = new HashSet<>();
	for(int i = 0 ; i<arr.length ; i++) {
		if(set.contains(arr[i])) {
			set.remove(arr[i]);
		}else {
			set.add(arr[i]);
		}
		
	}
	System.out.println(set.iterator().next());
	
	
//	0(1)
//	 int ans = nums[0];
//     for(int i = 1 ;i<nums.length ; i++){
//         ans = ans^nums[i];
//     }
//     return ans;
}
}
