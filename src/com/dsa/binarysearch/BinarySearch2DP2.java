package com.dsa.binarysearch;

import java.util.Arrays;

public class BinarySearch2DP2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int target = 1;

		System.out.println(Arrays.toString(search(arr, target)));
	}

	static int[] binarysearch(int[][] matrix, int row, int cstart, int cend, int target) {
		while (cstart <= cend) {
			int mid = cstart + (cend - cstart) / 2;

			if (matrix[row][mid] == target) {
				return new int[] { row, mid };
			}

			if (matrix[row][mid] > target) {
				cend = mid - 1;
			} else {
				cstart = mid + 1;
			}

		}
		return new int[] { -1, -1 };
	}

	static int[] search(int[][] arr, int target) {
		int row = arr.length;
		int col = arr[0].length;

		if (row == 1) {
			binarysearch(arr, 0, 0, col - 1, target);
		}
		
		int rStart = 0;
		int rEnd = row-1;
		int cMid = col/2;
		while(rStart < (rEnd-1)) {
			int mid = rStart + (rEnd-rStart)/2;
			
			if(arr[mid][cMid]==target) {
				return new int[] {mid,cMid};
			}
			
			if(arr[mid][cMid]<target) {
				rStart = mid;
			}
			else {
				rEnd = mid;
			}
		}
		
		if(arr[rStart][cMid]==target) {
			return new int[] {rStart , cMid};
		}
		
		if(arr[rStart+1][cMid]==target) {
			return new int[] {rStart+1 , cMid};
		}
		
		 if(target<=arr[rStart][cMid-1]) {
			 return binarysearch(arr, rStart, 0, cMid-1, target);
		 }
		 
		 
		 if(target>=arr[rStart][cMid+1] && target<=arr[rStart][col-1]) {
			 return binarysearch(arr, rStart, cMid,col-1 , target);
		 }
		 
		 
		 if(target<=arr[rStart+1][cMid-1]) {
			 return binarysearch(arr, rStart+1, 0, cMid-1, target);
		 }
		 
		 
		 else{
			 return binarysearch(arr, rStart+1, cMid, col-1, target);
		 }
		

	}
}
