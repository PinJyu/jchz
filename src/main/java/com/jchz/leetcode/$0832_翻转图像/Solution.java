package com.jchz.leetcode.$0832_翻转图像;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 17:57
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int l = 0, r = image[i].length - 1;
            while (l <= r) {
                if (l != r) {
                    int t = image[i][l];
                    image[i][l] = image[i][r] ^ 1;
                    image[i][r] = t ^ 1;
                }
                else
                    image[i][r] ^= 1;
                l++; r--;
            }
        }

        return image;
    }
}
