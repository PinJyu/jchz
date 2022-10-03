package com.jchz.leetcode.$0917_仅仅反转字母;

import java.util.Locale;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 17:08
 */
public class Solution {
    public String reverseOnlyLetters(String s) {
        int l = 0, r = s.length() - 1;
        char[] cs = s.toCharArray();
        while (l < r) {
            char cl = cs[l];
            char cr = cs[r];
            if (!Character.isLetter(cl)) {
                l++;
                continue;
            }

            if (!Character.isLetter(cr)) {
                r--;
                continue;
            }

            cs[l] = cr;
            cs[r] = cl;
            l++;
            r--;
        }


        return new String(cs);

    }
}
