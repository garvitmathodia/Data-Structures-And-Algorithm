package com.dsa.dp;

public class PathwithMaximumGold {

    public static void main(String[] args) {
        int[][] arr = {
            {0 , 1 , 4 , 2 , 8 , 2},
            {4 , 3 , 6 , 5 , 0 , 4},
            {1 , 2 , 4 , 1 , 4 , 6},
            {2 , 0 , 7 , 3 , 2 , 2},
            {3 , 1 , 5 , 9 , 2 , 4},
            {2 , 7 , 0 , 8 , 5 , 1}  
        };

        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            dp[i][arr[0].length - 1] = arr[i][arr[0].length - 1];
        }

        for (int j = arr[0].length - 2; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == arr.length - 1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            ans = Math.max(ans, dp[i][0]);
        }
        System.out.println(ans);
    }
}
