package com.jchz.leetcode.simple.$1716_计算力扣银行的钱;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 15:36
 */
public class Solution {
    public int totalMoney(int n) {
        int mode = n % 7;
        n /= 7;
        return (n * 2 + mode + 1) * mode / 2 +
                28 * n + n * (n - 1) / 2 * 7;
    }
}
