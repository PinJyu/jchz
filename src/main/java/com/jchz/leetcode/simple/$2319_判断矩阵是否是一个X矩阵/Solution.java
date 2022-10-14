package com.jchz.leetcode.simple.$2319_判断矩阵是否是一个X矩阵;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:24
 * @see
 * @since
 */
public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == j || i + j + 1 == grid.length) {
                    if (grid[i][j] == 0)
                        return false;
                }
                else {
                    if (grid[i][j] != 0)
                        return false;
                }
            }
        }

        return true;
    }

}
