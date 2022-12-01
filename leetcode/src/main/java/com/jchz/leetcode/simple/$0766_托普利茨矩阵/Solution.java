package com.jchz.leetcode.simple.$0766_托普利茨矩阵;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 17:40
 */
public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {

        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (y == 0 || x == 0) {
                    int y_ = y, x_ = x;
                    int check = matrix[y_][x_];
                    while (y_ < matrix.length && x_ < matrix[0].length) {
                        if (check != matrix[y_][x_])
                            return false;
                        y_++;
                        x_++;
                    }
                }
            }
        }

        return true;
    }

    public boolean isToeplitzMatrix_1(int[][] matrix) {
        for (int y = 0; y < matrix.length - 1; y++) {
            for (int x = 0; x < matrix[0].length - 1; x++) {
                if (matrix[y][x] != matrix[y + 1][x + 1])
                    return false;
            }
        }

        return true;
    }
}
