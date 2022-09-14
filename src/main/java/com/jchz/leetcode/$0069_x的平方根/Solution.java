package com.jchz.leetcode.$0069_x的平方根;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 19:01
 */
public class Solution {
    public int mySqrt(int x) {
        int a = 1;
        boolean over = false;
        while (true) {
            if (x > a * a) {
                if (over) {
                    a = a / 2 + 1;
                    over = false;
                    continue;
                }
                a *= 2;
            }
            if (x == a * a) {
                return a;
            }
            if (x < a * a) {
                over = true;
            }

        }
    }
}
