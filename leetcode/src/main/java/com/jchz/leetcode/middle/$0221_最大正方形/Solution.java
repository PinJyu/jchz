package com.jchz.leetcode.middle.$0221_最大正方形;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-02 20:03
 */
public class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0, n = matrix.length, m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (char) (matrix[i][j] - '0');
                if (matrix[i][j] == 1) {
                    int min = 1;
                    if (i != 0 && j != 0) {
                        int up = matrix[i - 1][j];
                        int left = matrix[i][j - 1];
                        int lu = matrix[i - 1][j - 1];
                        min += Math.min(up, Math.min(left, lu));
                    }

                    matrix[i][j] = (char) min;
                    max = Math.max(max, min);
                }
            }
        }

        return max * max;
    }
}
