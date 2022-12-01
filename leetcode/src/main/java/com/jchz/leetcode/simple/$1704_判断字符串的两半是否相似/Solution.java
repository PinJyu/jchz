package com.jchz.leetcode.simple.$1704_判断字符串的两半是否相似;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 15:19
 */
public class Solution {
    public boolean halvesAreAlike(String s) {
        char[] cs = s.toCharArray();
        int bh = 0, ah = 0;
        for (int i = 0; i < cs.length; i++) {
            int inc = 0;
            if ("AEIOUaeiou".contains(cs[i] + ""))
                inc = 1;
            if (i < cs.length / 2) {
                bh += inc;
            }
            else {
                ah += inc;
            }
        }

        return ah == bh;
    }
}
