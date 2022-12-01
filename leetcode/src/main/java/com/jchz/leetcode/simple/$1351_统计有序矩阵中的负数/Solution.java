package com.jchz.leetcode.simple.$1351_统计有序矩阵中的负数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-07 01:34
 */
public class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    count += m - i;
                    if (j == 0)
                        n = 0;
                }
                else {
                    n = j + 1;
                    break;
                }
            }
        }

        return count;
    }
}
