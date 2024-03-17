package com.dsa.recursion;

import java.util.Arrays;

public class Pattern {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
//		bubble(arr, arr.length-1, 0);
		selection(arr, arr.length , 0, 0);
		System.out.println(Arrays.toString(arr));
//		p1(4, 0);
	}

	static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c+1, c);
            } else {
                selection(arr, r, c+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }


	static void bubble(int[] arr, int r, int c) {
		if (r == 0) {
			return;
		}
		if (c < r) {
			if (arr[c] > arr[r]) {
				int temp = arr[c];
				arr[c] = arr[r];
				arr[r] = temp;
			}
			bubble(arr, r, c + 1);
		} else {
			bubble(arr, r - 1, 0);
		}
	}

	static void p1(int row, int col) {
		if (row == 0) {
			return;
		}

		if (col < row) {
			System.out.print("*");
			p1(row, col + 1);
		} else {
			System.out.println();
			p1(row - 1, 0);
		}
	}
}
