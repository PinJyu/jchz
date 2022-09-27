package com.jchz.leetcode.$0680_验证回文串II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 12:07
 */
public class Solution {
    public boolean validPalindrome(String s) {
        char[] cs = s.toCharArray();
        int l = 0, r = cs.length - 1;
        while (l < r) {
            if (cs[l] != cs[r])
                break;
            l++; r--;
        }


        return go(cs, l + 1, r) || go(cs, l, r + 1);
    }


    private boolean go(char[] cs, int l, int r) {
        while (l < r) {
            if (cs[l] != cs[r])
                return false;
            l++; r--;
        }

        return true;
    }

}
