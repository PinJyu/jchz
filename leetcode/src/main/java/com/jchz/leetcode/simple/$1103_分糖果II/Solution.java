package com.jchz.leetcode.simple.$1103_分糖果II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 19:05
 */
public class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = 1;
        int[] r = new int[num_people];
        while (candies > 0) {
            r[(n - 1) % num_people] += Math.min(n, candies);
            candies -= n;
            n++;
        }

        return r;
    }
}
