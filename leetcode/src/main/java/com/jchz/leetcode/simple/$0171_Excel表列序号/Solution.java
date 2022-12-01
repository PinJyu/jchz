package com.jchz.leetcode.simple.$0171_Excel表列序号;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 01:01
 */
public class Solution {
    public int titleToNumber(String columnTitle) {
        int base = 'A' - 1;
        int res = 0;
        int power = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(columnTitle.length() - 1 - i);
            power = power == 0 ? 1 : power * 26;
            res += (c - base) * base;
        }

        return res;
    }

    public int titleToNumber_1(String columnTitle) {
        int ans = 1;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + columnTitle.charAt(i) - 'A' + 1;
        }

        return ans;
    }
}

