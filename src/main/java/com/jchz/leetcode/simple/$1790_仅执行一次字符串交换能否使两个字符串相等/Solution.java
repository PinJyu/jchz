package com.jchz.leetcode.simple.$1790_仅执行一次字符串交换能否使两个字符串相等;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 18:24
 */
public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0, fi = -1, si = -1;
        char[] cs1 = s1.toCharArray();
        char[] cs2 = s2.toCharArray();

        for (int i = 0; i < cs1.length; i++) {
             if (cs1[i] != cs2[i]) {
                 count++;
                 if (count == 1)
                     fi = i;
                 else if (count == 2)
                     si = i;
                 else
                     break;
             }
        }

        if (count == 2) {
            return cs1[fi] == cs2[si] && cs1[si] == cs2[fi];
        }

        return count == 0;
    }
}
