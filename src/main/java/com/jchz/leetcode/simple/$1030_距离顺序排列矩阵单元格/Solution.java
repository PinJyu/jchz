package com.jchz.leetcode.simple.$1030_距离顺序排列矩阵单元格;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 22:34
 */
public class Solution {

    public static void main(String[] args) {
        new Solution().allCellsDistOrder(2, 2, 0, 1);
    }
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i <= rows + cols - 2; i++) {
            for (int j = 0; j <= i; j++) {
                int x_ = j, y_ = i - j;

                int[] x = {x_, -x_, x_, -x_};
                int[] y = {-y_, y_, y_, -y_};
                int l = x_ == 0 ? y_ == 0 ? 1 : 2 : y_ == 0 ? 2 : 4;
                for (int k = 0; k < l; k++) {
                    int m = rCenter - x[k];
                    int n = cCenter - y[k];
                    if (m >= 0 && m < rows && n >= 0 && n < cols) {
                        res.add(new int[]{m, n});
                    }
                }
            }
        }

        return res.toArray(new int[0][2]);
    }
}
