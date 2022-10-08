package com.jchz.leetcode.simple.$0867_转置矩阵;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 13:03
 */
public class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                res[j][i] =matrix[i][j];
            }
        }

        return res;
    }
}
