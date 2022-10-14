package com.jchz.leetcode.simple.$2373_矩阵中的局部最大值;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 00:29
 * @see
 * @since
 */
public class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] relationPostion = new int[][]{{-1, -1,}, {0, 1}, {1, 1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, -1}, {1, 1}};

        int[][] res = new int[len - 1][len - 1];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {
                int max = 0;
                for (int[] pointr : relationPostion) {
                    max = Math.max(max, grid[i + pointr[0]][j + pointr[1]]);
                }
                res[i - 1][j - 1] = max;
            }
        }

        return res;
    }

}
