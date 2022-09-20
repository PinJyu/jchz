package com.jchz.leetcode.$0415_字符串相加;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 10:56
 */
public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()) {
            return addStrings(num2, num1);
        }
        char[] cs1 = num1.toCharArray(); // short
        char[] cs2 = num2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < cs1.length; i++) {
            char c1 = cs1[cs1.length - 1 - i];
            char c2 = cs2[cs2.length - 1 - i];
            char r = (char) (c1 - '0' + c2 + carry);
            carry = 0;
            if (r > '9') {
                carry = 1;
                r = (char) (r - '9' - 1 + '0');
            }
            sb.append(r);
        }

        int restLen = cs2.length - cs1.length;

        for (int i = 0; i < restLen; i++) {
            char c2 = cs2[restLen - 1 - i];
            char r = (char) (c2 + carry);
            carry = 0;
            if (r > '9') {
                carry = 1;
                r = (char) (r - '9' - 1 + '0');
            }
            sb.append(r);
        }

        if (carry == 1) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
