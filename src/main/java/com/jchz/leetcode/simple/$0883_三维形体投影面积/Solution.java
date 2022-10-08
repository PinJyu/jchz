package com.jchz.leetcode.simple.$0883_三维形体投影面积;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 16:22
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().projectionArea(new int[][]{{1,2,1},{2,1,1},{2,0,4}});
    }

    public int projectionArea(int[][] grid) {
        int xy = 0, xz = 0, yz = 0;

        int[] maxCol = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int maxRow = 0;
            for (int j = 0; j < grid[0].length; j++) {
                int t = grid[i][j];
                if (t > 0)
                    xy++;
                maxRow = Math.max(maxRow, t);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
            xz += maxRow;
        }

        for (int i : maxCol) {
            yz += i;
        }

        return xy + xz + yz;
    }
}
