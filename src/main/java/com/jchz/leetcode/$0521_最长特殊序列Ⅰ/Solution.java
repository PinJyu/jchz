package com.jchz.leetcode.$0521_最长特殊序列Ⅰ;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 17:05
 */
public class Solution {

    public int findLUSlength(String a, String b) {

        if (a.length() == b.length()) {
            if (a.equals(b))
                return -1;
            else
                return a.length();
        }
        else {
            return Math.max(a.length(), b.length());
        }

    }


}
