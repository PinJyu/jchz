package com.jchz.leetcode.$0709_转换成小写字母;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 18:17
 */
public class Solution {
    public String toLowerCase(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (c >= 'A' && c <= 'Z') {
                cs[i] = (char) (c | 32);
            }
        }

        return new String(cs);
    }
}
