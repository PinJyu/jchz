package com.jchz.leetcode.$0806_写字符串需要的行数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-29 11:54
 */
public class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        if ("".equals(s)) return new int[]{0, 0};
        int sum = 0, lines = 1;
        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (sum + width > 100) {
                lines++;
                sum = width;
            }
            else
                sum += width;
        }

        return new int[] {lines, sum};
    }
}
