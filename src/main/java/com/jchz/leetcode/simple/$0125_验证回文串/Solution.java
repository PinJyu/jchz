package com.jchz.leetcode.simple.$0125_验证回文串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 12:58
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l <= r) {
            char lc = transfer(s.charAt(l));
            if (' ' == lc) {
                l++;
                continue;
            }
            char rc = transfer(s.charAt(r));
            if (' ' == rc) {
                r--;
                continue;
            }

            if (lc == rc) {
                l++; r--;
            }
            else {
                return false;
            }

        }

        return true;
    }

    private char transfer(char item) {
        if (item >= 'a' && item <= 'z') { // lower case letter
            return item;
        }
        else if (item >= 'A' && item <= 'Z') { // bigger case letter
            return (char) (item + 16);
        }
        else if (item >= '0' && item <= '9') { // digit
            return item;
        }
        else {
            return ' ';
        }
    }
}
