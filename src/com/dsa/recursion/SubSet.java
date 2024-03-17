package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
//		List<List<Integer>> list = subset(arr);
		List<List<Integer>> list = subsetDuplicates(arr);
		for (List<Integer> l : list) {
			System.out.println(l);
		}
	}
	
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num : arr) {
			int n = outer.size();
			for(int i = 0 ; i< n ; i++) {
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
	
	static List<List<Integer>> subsetDuplicate(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		int start = 0;
		int end = 0;
		for(int i=0 ; i<arr.length ; i++) {
			start=0;
			if(i>0 && arr[i]==arr[i-1]) {
				start = end+1;
			}
			end = outer.size()-1;
			int n = outer.size();
			for(int j = start ; j< n ; j++) {
				List<Integer> internal = new ArrayList<>(outer.get(j));
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}
	
	public static List<List<Integer>> subsetDuplicates(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr)
        {
            int n= outer.size();
            for (int i = 0; i < n; i++)
            {
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                if(!outer.contains(inner))
                    outer.add(inner);
            }
        }
        return outer;
    }

}
