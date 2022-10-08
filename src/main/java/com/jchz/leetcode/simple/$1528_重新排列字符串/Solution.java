package com.jchz.leetcode.simple.$1528_重新排列字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 21:26
 * @see
 * @since
 */
public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] r = new char[indices.length];
        char[] cs = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            r[indices[i]] = cs[i];
        }

        return new String(r);

    }
}
