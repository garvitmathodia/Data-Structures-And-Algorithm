package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,4,1,3,1};
		
		Map<Integer , Integer> map = new HashMap<>();
		for(int i =0 ; i<arr.length ; i++) {
			int element = arr[i];
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}else {
				map.put(element, 1);
			}
		}
		int max = 0;
		int ansKey = -1;
		for(var m : map.entrySet()) {
			if(m.getValue()>max) {
				max = m.getValue();
				ansKey = m.getKey();
			}
		}
		System.out.println(ansKey);
	}
}
