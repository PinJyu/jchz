package com.jchz.leetcode.$0191_位1的个数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 01:50
 */
public class Solution {
    public int hammingWeight(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans += n & 1;
            n >>= 1;
        }

        return ans;
    }
}
