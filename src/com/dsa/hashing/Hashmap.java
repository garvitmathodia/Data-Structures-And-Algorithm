package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Garvit", 21);
		map.put("Ghruv", 22);
		map.put("Aman", 23);
		map.put("Deep", 24);
		map.put("Isht", 25);
		map.put("Omik", 26);

		for (String key : map.keySet()) {
			System.out.printf("Age of %s is %d \n", key, map.get(key));
		}
		System.out.println();

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
		}
		System.out.println();

		for (var e : map.entrySet()) {
			System.out.printf("Age of %s is %d \n", e.getKey(), e.getValue());
		}
		
	}
}
