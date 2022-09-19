package com.jchz.leetcode.$0392_判断子序列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-19 17:09
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if ("".equals(s)) return true;
        char[] cs = t.toCharArray();
        char[] cs_ = s.toCharArray();
        int index = 0;
        char curS = cs_[0];

        for (char c : cs) {
            if (c == curS && ++index < cs_.length) {
                curS = cs_[index];
            }
        }

        return index == cs_.length;
    }
}
