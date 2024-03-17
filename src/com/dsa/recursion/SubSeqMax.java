package com.dsa.recursion;

import java.util.ArrayList;

public class SubSeqMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = 3;
        int sum = 2;
        ArrayList<Integer> list = new ArrayList<>();
        Find(0, list, arr, sum, n, 0);
    }

    static void Find(int ind, ArrayList<Integer> list, int[] arr, int sum, int n, int s) {
        if (ind == n) {
            if (s == sum) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }
     
        list.add(arr[ind]);
        s += arr[ind];
        Find(ind + 1, list, arr, sum, n, s);
        list.remove(list.size() - 1);
        s -= arr[ind];
        Find(ind + 1, list, arr, sum, n, s);
    }
}
