package com.jchz.leetcode.simple.$1736_替换隐藏数字得到的最晚时间;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 16:08
 */
public class Solution {
    public String maximumTime(String time) {
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);
        char m1 = time.charAt(3);
        char m2 = time.charAt(4);
        if (h1 == '?') {
            if (h2 == '?') {
                h1 = '2';
                h2 = '3';
            }
            else if (h2 > '4') {
                h1 = '1';
            }
            else {
                h1 = '2';
            }
        }

        if (h2 == '?') {
            if (h1 > '1') {
                h2 = '3';
            }
            else {
                h2 = '9';
            }
        }

        if (m1 == '?') {
            if (m2 == '?') {
                m1 = '5';
                m2 = '9';
            }
            else {
                m1 = '5';
            }
        }

        if (m2 == '?') {
            m2 = '9';
        }

        return h1 + "" + h2 + ":" + m1 + "" + m2;
    }
}
