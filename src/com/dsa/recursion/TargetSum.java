package com.dsa.recursion;

import java.util.*;
public class TargetSum {

    public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int target = 70;
		helper(arr , target , new ArrayList<>() , 0);
	}
	
	public static void helper(int[] arr , int target , ArrayList<Integer> list , int index){
	    if(target==0){
	        for(int i = 0 ; i<list.size() ; i++){
	            System.out.print(list.get(i) + " ");
	        }
	        System.out.println();
	        return;
	    }
	    
	    if(target<0 || index>=arr.length) return;
	    
	    list.add(arr[index]);
	    helper(arr , target-arr[index] , list , index+1);
	    list.remove(list.size()-1);
	    helper(arr , target , list , index+1);
	}
}
