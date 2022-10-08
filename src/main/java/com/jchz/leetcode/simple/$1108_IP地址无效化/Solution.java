package com.jchz.leetcode.simple.$1108_IP地址无效化;

import java.util.Locale;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 19:14
 */
public class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] cs = address.toCharArray();
        for (char c : cs) {
            if (c == '.') {
                sb.append('[').append(c).append(']');
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
