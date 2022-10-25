package com.jchz.leetcode.simple.$剑指OfferII0001_整数除法;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 12:21
 */
public class Solution {

    public int divide(int a, int b) {
        int a_ = a, b_ = b;
        if (a_ == Integer.MIN_VALUE && b_ == -1)
            return Integer.MAX_VALUE;

        a_ = a_ < 0 ? a_ : -a_;
        b_ = b_ < 0 ? b_ : -b_;
        int na = a_, nb = b_;

        int ret = 0;

        while (a_ <= b_) {
            int bmove = 0;
            while ((b_ << 1) >= a_ && (b_ << 1) < nb) {
                b_ <<= 1;
                bmove++;
            }

            ret += 1 << bmove;
            a_ -= b_;
            b_ = nb;
        }

        return (a ^ b) >= 0 ? ret : -ret;
    }

}
