package com.jchz.leetcode.middle.$0189_轮转数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 17:41
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0)
            return;

        int count = gcd(k, nums.length);

        for (int i = 0; i < count; i++) {
            int s = i;
            int temp = nums[i];
            do {
                s = (s + k) % nums.length;
                int t = nums[s];
                nums[s] = temp;
                temp = t;

            } while (s != i);
        }

    }

    int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

}
