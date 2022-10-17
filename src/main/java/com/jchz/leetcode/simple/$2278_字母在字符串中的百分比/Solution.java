package com.jchz.leetcode.simple.$2278_字母在字符串中的百分比;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 18:30
 */
public class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
           count += letter == c ? 1 : 0;
        }

        return (int ) (count / (double) s.length() * 100);
    }
}
