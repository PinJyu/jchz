package com.jchz.leetcode.simple.$1869_哪种连续子字符串更长;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 15:01
 */
public class Solution {
    public boolean checkZeroOnes(String s) {
        char[] cs = s.toCharArray();
        int max1 = Integer.MIN_VALUE, max0 = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (i == 0 || cs[i] == cs[i-1]) {
                count++;
            }
            else {
                count = 1;
            }
            if (cs[i] == '1')
                max1 = Math.max(max1, count);
            else if (cs[i] == '0')
                max0 = Math.max(max0, count);
        }

        return max1 > max0;
    }
}
