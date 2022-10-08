package com.jchz.leetcode.simple.$0796_旋转字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 18:39
 */
public class Solution {
    public boolean rotateString(String s, String goal) {
        for (int i = 1; i < s.length(); i++) {
            String ns = s.substring(i) + s.substring(0, i);
            if (ns.equals(goal))
                return true;

        }

        return false;
    }

    public boolean rotateString_1(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
