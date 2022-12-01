package com.jchz.leetcode.middle.$0011_盛最多水的容器;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 19:36
 */
public class Solution {
    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        while (l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if (height[r] <= height[l]) {
                r--;
            }
            else {
                l++;
            }
        }

        return max;
    }
}
