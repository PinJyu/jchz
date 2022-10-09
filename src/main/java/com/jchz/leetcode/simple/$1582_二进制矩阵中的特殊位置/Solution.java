package com.jchz.leetcode.simple.$1582_二进制矩阵中的特殊位置;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 11:58
 */
public class Solution {
    public int numSpecial(int[][] mat) {
        int[] xc = new int[mat.length], yc = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                xc[i] += mat[i][j];
                yc[j] += mat[i][j];
            }
        }

        int count = 0;
        for (int i = 0; i < xc.length; i++) {
            if (xc[i] != 1)
                continue;
            for (int j = 0; j < yc.length; j++) {
               if (yc[j] == 1 && mat[i][j] == 1)
                   count++;
            }
        }

        return count;
    }
}
