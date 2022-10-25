package com.jchz.leetcode.simple.$剑指OfferII0002_二进制加法;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 15:38
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (a.length() > b.length())
            return addBinary(b, a);

        while (a.length() < b.length())
            a = "0" + a;

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            int s = a.charAt(i) + b.charAt(i) - '0' - '0' + carry;
            carry = (s & 2) >>> 1;
            s = (s & 1) + '0';
            sb.append((char) s);
        }

        if (carry > 0)
            sb.append('1');

        return sb.reverse().toString();
    }
}
