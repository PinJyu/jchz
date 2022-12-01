package com.jchz.leetcode.simple.$1886_判断矩阵经轮转后是否一致;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:10
 */
public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (cmp(mat, target))
                return true;
            else if (i < 3)
                mat = rotate(mat);
        }

        return false;
    }

    boolean cmp (int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }

        return true;
    }

    int[][] rotate(int[][] mat) {
        int n = mat.length;
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; i++) {
            ret[i] = new int[n];
            for (int j = 0; j < n; j++) {
                ret[i][j] = mat[j][n - 1 - i];
            }
        }

        return ret;
    }

}
