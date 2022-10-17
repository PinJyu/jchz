package com.jchz.leetcode.simple.$2264_字符串中最大的3位相同数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 17:54
 */
public class Solution {
    public String largestGoodInteger(String num) {
        char r = ' ';
        char[] cs = num.toCharArray();
        for (int i = 0; i + 2 < cs.length;) {
            if (cs[i + 1] == cs[i]) {
                if (cs[i + 2] == cs[i + 1])
                    r = (char) Math.max(r, cs[i]);
                else
                    i += 3;
            }
            else {
                if (cs[i + 2] == cs[i + 1])
                    i++;
                else
                    i += 3;
            }
        }

        return r == ' ' ? "" : new String(new char[]{r, r, r});
    }
}
