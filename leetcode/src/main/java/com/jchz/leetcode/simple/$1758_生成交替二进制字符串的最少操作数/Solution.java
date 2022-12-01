package com.jchz.leetcode.simple.$1758_生成交替二进制字符串的最少操作数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 17:01
 */
public class Solution {
    public int minOperations(String s) {
        char[] cs = s.toCharArray();

        int bz = 0, bo = 1, cbz = 0, cbo = 0;
        for (int i = 0; i < cs.length; i++) {
            int v = cs[i] - 'a';
            cbz += v != bz ? 1 : 0;
            cbo += v != bo ? 1 : 0;
            bz ^= 1;
            bo ^= 1;
        }

        return Math.min(cbz, cbo);
    }
}
