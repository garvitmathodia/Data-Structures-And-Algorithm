package com.dsa.basic;

import java.util.Arrays;

public class StringQuestion {
     public static void main(String[] args) {
        String str = "xyzzyyyz";
        
        // Step 1: Count the frequency of each character
        int[] freq = new int[256]; // assuming ASCII characters
        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Prepare an array of characters present in the string
        char[] uniqueChars = new char[str.length()];
        int index = 0;
        for (char c : str.toCharArray()) {
            if (freq[c] > 0) {
                uniqueChars[index++] = c;
                freq[c] = -freq[c]; // Mark as processed
            }
        }

        // Step 3: Sort unique characters based on frequency and order in the string
        Arrays.sort(uniqueChars, 0, index, (a, b) -> {
            int freqCompare = Integer.compare(-freq[a], -freq[b]);
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return str.indexOf(a) - str.indexOf(b);
            }
        });

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            char c = uniqueChars[i];
            result.append(c).append(-freq[c]);
        }

        // Print the result
        System.out.println(result.toString());
    }
}
