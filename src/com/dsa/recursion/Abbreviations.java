package com.dsa.recursion;

public class Abbreviations {

    public static void main(String[] args) {
		String s = "pep";
		helper(s, "" , 0);
	}
	
	public static void helper(String s1 , String s2 , int count){
	    if(s1.isEmpty()){
	        if(count>0){
	            System.out.print(s2 + count +" ");
	        }else{
	            System.out.print(s2 + " ");
	        }
	        return;
	    }
	    
	    char ch = s1.charAt(0);
	    if(count>0){
	        helper(s1.substring(1) , s2+count+ch , 0);
	    }else{
	        helper(s1.substring(1) , s2+ch , count);
	    }
	    helper(s1.substring(1) , s2 , count+1);
	    
	    
	}
}
