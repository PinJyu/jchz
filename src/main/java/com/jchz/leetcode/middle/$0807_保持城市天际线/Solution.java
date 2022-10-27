package com.jchz.leetcode.middle.$0807_保持城市天际线;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 16:26
 */
public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rmax = new int[grid.length];
        int[] cmax = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                rmax[i] = Math.max(rmax[i], grid[i][j]);
                cmax[j] = Math.max(cmax[j], grid[i][j]);
            }
        }
        int ret = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                ret += Math.min(rmax[i], cmax[j]) - grid[i][j];
            }
        }


        return ret;
    }
}
