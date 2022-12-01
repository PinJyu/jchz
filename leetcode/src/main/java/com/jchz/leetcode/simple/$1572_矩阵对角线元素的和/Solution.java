package com.jchz.leetcode.simple.$1572_矩阵对角线元素的和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 10:43
 */
public class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length, mid = len > 1 ? len / 2 : 1, sum = 0;
        int center = (len & 1) == 1 ? mat[mid][mid] : 0;
        int l = 0, r = len - 1;
        for (int[] ints : mat) {
            sum += ints[l] + ints[r];
            l++;
            r--;
        }

        return sum - center;
    }
}
