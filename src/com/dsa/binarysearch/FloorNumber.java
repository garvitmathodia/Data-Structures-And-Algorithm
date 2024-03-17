package com.dsa.binarysearch;

public class FloorNumber {
	public static void main(String[] args) {
		int[] arr = { -2, 44, 55, 66, 77, 78, 98 };
		int target = 76;

		int index = (binarySearch(arr, target));

		System.out.println(index);

	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return end;

	}
}
