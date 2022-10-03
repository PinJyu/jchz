package com.jchz.leetcode.$0190_颠倒二进制位;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 01:39
 */
public class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = ans << 1 | (n & 1);
            n >>= 1;
        }
        return ans;
    }
}
