package com.jchz.leetcode.$0367_有效的完全平方数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 15:43
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        double x_ = 1;

        while (true) {
            double x = x_ / 2 + num / x_ / 2;
            if (Math.abs(x - x_) < 1e-7)
                break;
            x_ = x;
        }

        int x = (int) x_;
        return x * x == num;
    }
}
