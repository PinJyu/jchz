package com.jchz.leetcode.simple.$0892_三维形体的表面积;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 17:19
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
           int s = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int t = grid[i][j];
                if (t > 0) {
                    s += t * 6 - (t - 1) << 1;
                    if (i - 1 >= 0)
                        s -= Math.min(t, grid[i - 1][j]);
                    if (i + 1 < grid.length)
                        s -= Math.min(t, grid[i + 1][j]);
                    if (j - 1 >= 0)
                        s -= Math.min(t, grid[i][j - 1]);
                    if (j + 1 < grid.length)
                        s -= Math.min(t, grid[i][j + 1]);
                }
            }
        }

        return s;
    }
}
