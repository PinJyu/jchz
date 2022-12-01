package com.jchz.leetcode.simple.$0661_unresolve_图片平滑器;

import javafx.util.Pair;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 16:47
 */
public class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Pair<Integer, Integer> sum = sum(img, j, i, m, n);

            }
        }
        return null;
    }

    private Pair<Integer, Integer> sum(int[][] img, int x, int y, int m, int n) {
        int sum = 0, count = 0;

        if (x - 1 >= 0) {
            sum += img[y][x - 1];
            count++;
            if (y - 1 >= 0)
                sum += img[y - 1][x - 1]; count++;
            if (y + 1 < m)
                sum += img[y + 1][x - 1]; count++;
        }

        if (x + 1 < n) {
            sum += img[y][x + 1];
            count++;
            if (y - 1 >= 0)
                sum += img[y - 1][x + 1]; count++;
            if (y + 1 < m)
                sum += img[y + 1][x + 1]; count++;
        }

        sum += img[y][x];
        count++;
        if (y - 1 >= 0)
            sum += img[y - 1][x]; count++;
        if (y + 1 < m)
            sum += img[y + 1][x]; count++;

        return new Pair<>(sum, count);
    }

}
