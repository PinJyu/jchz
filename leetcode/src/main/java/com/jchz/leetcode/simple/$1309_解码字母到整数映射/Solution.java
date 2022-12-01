package com.jchz.leetcode.simple.$1309_解码字母到整数映射;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 20:01
 */
public class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();
        for (int i = cs.length - 1; i >= 0; i--) {
            char c = cs[i];
            if (c == '#') {
                sb.append(((char) ((cs[i - 2] - '0') * 10 + cs[i - 1] - '0' + 'a' - 1)));
                i -= 2;
            }
            else {
                sb.append(((char) (c - '0' + 'a' - 1)));
            }
        }

        return sb.reverse().toString();
    }
}
