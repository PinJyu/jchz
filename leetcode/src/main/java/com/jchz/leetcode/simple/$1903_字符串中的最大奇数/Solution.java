package com.jchz.leetcode.simple.$1903_字符串中的最大奇数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 16:46
 */
public class Solution {
    public String largestOddNumber(String num) {
        char[] vs = num.toCharArray();
        for (int i = vs.length - 1; i >= 0; i--) {
            if ((vs[i] - '0') % 2 == 1)
                return num.substring(0, i+1);
        }

        return "";
    }
}
