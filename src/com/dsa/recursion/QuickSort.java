package com.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
//		 List<Integer> arr = new ArrayList<>();
//	        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
//	        int n = arr.size();
//	        
//	        arr = quickSort(arr);
//	        
//	        System.out.println(arr);
		
	}
	
//	static int partition(List<Integer> arr, int low, int high) {
//        int pivot = arr.get(low);
//        int i = low;
//        int j = high;
//
//        while (i < j) {
//            while (arr.get(i) <= pivot && i <= high - 1) {
//                i++;
//            }
//
//            while (arr.get(j) > pivot && j >= low + 1) {
//                j--;
//            }
//            if (i < j) {
//                int temp = arr.get(i);
//                arr.set(i, arr.get(j));
//                arr.set(j, temp);
//            }
//        }
//        int temp = arr.get(low);
//        arr.set(low, arr.get(j));
//        arr.set(j, temp);
//        return j;
//    }
//
//    static void qs(List<Integer> arr, int low, int high) {
//        if (low < high) {
//            int pIndex = partition(arr, low, high);
//            qs(arr, low, pIndex - 1);
//            qs(arr, pIndex + 1, high);
//        }
//    }
//    public static List<Integer> quickSort(List<Integer> arr) {
//        // Write your code here.
//        qs(arr, 0, arr.size() - 1);
//        return arr;
//    }
	
	static void quicksort(int[] arr , int low , int high) {
		if(low>=high) {
			return;
		}
		int start = low;
		int end = high;
		int mid = (start+end)/2;
		int pivot = arr[mid];
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		quicksort(arr, low, end);
		quicksort(arr, start, high);
	}
	
}
