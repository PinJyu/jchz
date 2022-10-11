package com.jchz.leetcode.simple.$1961_检查字符串是否为数组前缀;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 18:14
 */
public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        char[] cs = s.toCharArray();
        int index = 0;
        for (String word : words) {
            char[] wcs = word.toCharArray();
            for (int i = 0; i < wcs.length; i++) {
                if (wcs[i] != cs[index])
                    return false;
                else {
                    index++;
                    if (index >= s.length())
                        return wcs.length == i + 1;
                }
            }
        }

        return false;
    }
}
