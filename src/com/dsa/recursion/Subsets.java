package com.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);
        current.remove(current.size() - 1); 
        generateSubsets(arr, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subsets = subset(arr);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}

