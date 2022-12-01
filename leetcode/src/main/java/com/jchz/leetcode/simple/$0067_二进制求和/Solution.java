package com.jchz.leetcode.simple.$0067_二进制求和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-09 18:26
 */
public class Solution {
    public String addBinary(String a, String b) {
        char[] cs_a = a.toCharArray();
        char[] cs_b = b.toCharArray();
        int length = Math.max(cs_a.length, cs_b.length);

        StringBuilder res = new StringBuilder();
        char up = 0;
        for (int i = 1; i <= length; i++) {
            char one = 0;
            if (cs_a.length - i >= 0)
                one = (char) (cs_a[cs_a.length - i] - '0');

            char other = 0;
            if (cs_b.length - i >= 0)
                other = (char) (cs_b[cs_b.length - i] - '0');

            up = (char) (one + other + up);
            res.append(up % 2);
            up /= 2;

        }

        if (up > 0)
            res.append('1');

        return res.reverse().toString();
    }
}
