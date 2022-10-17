package com.jchz.leetcode.simple.$剑指Offer0029_顺时针打印矩阵;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-17 20:21
 * @see
 * @since
 */
public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int[] ret = new int[matrix.length * matrix[0].length];
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = -1, index = 0;
        for (int i = 0; true; i = (i + 1) % direct.length) {
            x += direct[i][0];
            y += direct[i][1];
            while (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && !visited[x][y]) {
                ret[index++] = matrix[x][y];
                visited[x][y] = true;
                x += direct[i][0];
                y += direct[i][1];
            }
            x -= direct[i][0];
            y -= direct[i][1];
            if (index == ret.length)
                break;
        }

        return ret;
    }


}
