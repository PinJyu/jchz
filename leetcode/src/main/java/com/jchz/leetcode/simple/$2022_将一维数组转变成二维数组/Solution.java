package com.jchz.leetcode.simple.$2022_将一维数组转变成二维数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 17:34
 */
public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];
        int[][] ret = new int[m][n];

        int index = 0;

        for (int x = 0; x < ret.length; x++) {
            for (int y = 0; y < ret.length; y++) {
                ret[x][y] = original[index++];
            }
        }

        return ret;
    }
}
