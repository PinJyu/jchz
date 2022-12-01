package com.jchz.leetcode.simple.$2027_转换字符串的最少操作次数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 17:38
 */
public class Solution {
    public int minimumMoves(String s) {
        char[] cs = s.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 'X') {
                i += 2;
                count++;
            }
        }

        return count;
    }
}
