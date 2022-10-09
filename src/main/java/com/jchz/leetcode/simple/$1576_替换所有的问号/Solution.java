package com.jchz.leetcode.simple.$1576_替换所有的问号;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 10:54
 */
public class Solution {
    public String modifyString(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == '?') {
                char l = i - 1 >= 0 && Character.isLowerCase(cs[i - 1]) ? cs[i - 1] : 'a';
                char r = i + 1 < cs.length && Character.isLowerCase(cs[i + 1]) ? cs[i + 1] : 'a';
                cs[i] = (char) (Math.abs(l - r) <= 1 ? l + 2 > 'z' ? l - 2 : l + 2 : (l + r) / 2);
            }
        }

        return new String(cs);
    }
}
