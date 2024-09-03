package com.dsa.recursion;

public class MaximumScoreofWordsProblem {

    public static void main(String[] args) {
		String[] words = {"dog" , "cat" , "dad" , "good"};
		int[] farr  = {1,1,1,3,0,0,1,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
		int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
// 		System.out.println(score.length);
        int ans = helper(words , farr , score , 0);
        System.out.println(ans);
	}
	
	public static int helper(String[] words , int[] farr , int[] score , int index){
	    if(index==words.length)return 0;
	    
	    int sno = helper(words , farr , score , index+1);
	    boolean flag = true;
	    String s = words[index];
	    int sword = 0;
	    for(int i = 0 ; i<s.length() ; i++){
	        char ch = s.charAt(i);
	        
	        if(farr[ch-'a']==0){
	            flag = false;
	        }
	        
	        farr[ch-'a']--;
	        sword += score[ch-'a'];
	        
	    }
	    
	    int syes = 0;
	    if(flag){
	        syes = sword + helper(words , farr , score , index+1);
	    }
	    
	    for(int i = 0 ; i<s.length() ; i++){
	        char ch = s.charAt(i);
	        farr[ch-'a']++;
	    }
	    return Math.max(sno , syes);
	}
}
