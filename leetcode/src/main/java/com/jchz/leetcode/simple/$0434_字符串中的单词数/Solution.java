package com.jchz.leetcode.simple.$0434_字符串中的单词数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 11:13
 */
public class Solution {
    public int countSegments(String s) {
        char[] cs = s.toCharArray();

        int res = 0, reduce = 0;
        for (char c : cs) {

            if (c != ' ') {
                reduce++;
            }
            else {
                if (reduce > 0) {
                    res++;
                    reduce = 0;
                }
            }
        }

        if (reduce > 0)
            res++;

        return res;
    }
}
