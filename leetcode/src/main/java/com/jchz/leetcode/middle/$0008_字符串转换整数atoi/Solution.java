package com.jchz.leetcode.middle.$0008_字符串转换整数atoi;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-22 17:42
 */
public class Solution {
    public int myAtoi(String s) {
        long base = 0;
        int sign = 1;
        int begin = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '+') {
                sign = 1;
                begin = i + 1;
                break;
            }
            else if (cs[i] == '-') {
                sign = -1;
                begin = i + 1;
                break;
            }
            else if (Character.isDigit(cs[i])) {
                sign = 1;
                begin = i;
                break;
            }
            else if (cs[i] == ' ')
                continue;
            else
                return 0;
        }

        for (int i = begin; i < cs.length; i++) {
            if (Character.isDigit(cs[i])) {
                base *= 10;
                base += cs[i] - '0';
            }
            else {
                break;
            }
            if (base * sign > Integer.MAX_VALUE) {
                base = Integer.MAX_VALUE;
                break;
            }
            if (base * sign < Integer.MIN_VALUE) {
                base = Integer.MIN_VALUE;
                sign = 1;
                break;
            }
        }

        base *= sign;

        if (base > Integer.MAX_VALUE) {
            base = Integer.MAX_VALUE;
        }
        if (base < Integer.MIN_VALUE) {
            base = Integer.MIN_VALUE;
        }

        return (int) base;
    }
}
