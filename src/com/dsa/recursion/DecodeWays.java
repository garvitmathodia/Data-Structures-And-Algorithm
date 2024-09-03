package com.dsa.recursion;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    public static void main(String[] args) {
		Map<Integer , Character> m = new HashMap<>();
		for (int i = 1; i <= 26; i++) {
            m.put(i, (char) ('a' + i - 1));
        }
		String s1 = "12103";
		
		encode(s1 , m , "");
	}
	
	public static void encode(String s1 , Map<Integer,Character> m , String s2){
        if(s1.startsWith("0")){
            return;
        }

	    if(s1.isEmpty()){
	        System.out.println(s2+" ");
	        return;
	    }
	    
	    if(s1.length()>=1){
	        int i = Integer.parseInt(s1.substring(0 , 1));
	        if(m.containsKey(i)){
	        encode(s1.substring(1) , m , s2+m.get(i));
	        }
	    }
	    
	    if(s1.length()>=2){
	        int j = Integer.parseInt(s1.substring(0 , 2));
	        if(m.containsKey(j)){
	        encode(s1.substring(2) , m , s2+m.get(j));
	        }
	    }
	}
}
