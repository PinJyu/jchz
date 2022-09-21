package com.jchz.leetcode.$0504_七进制数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 12:04
 */
public class Solution {

    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        int v = Math.abs(num);

        if (v == 0) sb.append(v);
        while (v > 0) {
            int mode = v % 7;
            sb.append(mode);
            v /= 7;
        }

        if (num < 0)
            sb.append("-");

        return sb.reverse().toString();
    }

}
