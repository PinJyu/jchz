package com.jchz.leetcode.middle.$0240_搜索二维矩阵II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-02 20:35
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int x = 0, y = m - 1;
        while (x < n && y >= 0) {
            if (matrix[x][y] ==  target)
                return true;
            else if (matrix[x][y] < target)
                x++;
            else
                y--;
        }

        return false;
    }
}
