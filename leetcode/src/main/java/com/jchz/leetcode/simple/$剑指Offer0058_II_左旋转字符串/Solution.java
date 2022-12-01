package com.jchz.leetcode.simple.$剑指Offer0058_II_左旋转字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 15:56
 */
public class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            sb.append(s.charAt((i + n) % length));
        }

        return sb.toString();
    }
}
