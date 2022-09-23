package com.jchz.leetcode.$0566_重塑矩阵;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 13:07
 */
public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int or = mat.length;
        int oc = mat[0].length;
        if (or * oc != r * c)
            return mat;

        int[][] res = new int[r][c];
        int r_ = 0, c_ = 0;

        for (int i = 0; i < or; i++) {
            for (int j = 0; j < oc; j++) {
                res[r_][c_] = mat[i][j];

                if (++c_ == c) {
                    c_ = 0;
                    r_++;
                }
            }
        }

        return res;
    }
}
