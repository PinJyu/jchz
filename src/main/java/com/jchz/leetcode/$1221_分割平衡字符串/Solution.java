package com.jchz.leetcode.$1221_分割平衡字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 23:06
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int stack = 0;
        int ret = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R')
                stack++;
            else
                stack--;

            if (stack == 0)
                ret++;

        }

        return ret;
    }
}
