package com.jchz.leetcode.simple.$1876_长度为三且各字符不同的子字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 15:18
 */
public class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i + 2 < cs.length; i++) {
            if (cs[i] != cs[i + 1] && cs[i] != cs[i + 2] && cs[i + 1] != cs[i + 2])
                count++;
            else if (cs[i + 1] == cs[i + 2])
                i++;
        }

        return count;
    }
}
