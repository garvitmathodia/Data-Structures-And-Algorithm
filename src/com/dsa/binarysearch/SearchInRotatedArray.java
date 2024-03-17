package com.dsa.binarysearch;

public class SearchInRotatedArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 2;
		int n = arr.length - 1;
		int max = pivot(arr);
		int ans = binarySearch(arr, target, 0, max);

		if (ans != -1) {
			System.out.println(ans);
		}

		ans = binarySearch(arr, target, max + 1, n);
		System.out.println(ans);
	}

	static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[start] <= arr[mid]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		return start;
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
