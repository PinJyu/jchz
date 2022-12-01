package com.jchz.leetcode.simple.$1957_删除字符使字符串变好;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 18:05
 */
public class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cs = s.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            if (sb.length() > 1 && cs[i] == sb.charAt(sb.length() - 1) && cs[i] == sb.charAt(sb.length() - 2)) {
            }
            else {
                sb.append(cs[i]);
            }
        }

        return sb.toString();
    }
}
