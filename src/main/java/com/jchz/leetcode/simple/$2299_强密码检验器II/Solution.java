package com.jchz.leetcode.simple.$2299_强密码检验器II;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 21:48
 * @see
 * @since
 */
public class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8)
            return false;
        char[] cs = password.toCharArray();
        boolean containDigit = false, containLowerCase = false, containUpperCase = false, containOther = false;
        for (int i = 0; i < cs.length; i++) {
            if (i != 0 && cs[i] == cs[i - 1])
                return false;

            if (Character.isLowerCase(cs[i]))
                containLowerCase = true;
            else if (Character.isUpperCase(cs[i]))
                containUpperCase = true;
            else if (Character.isDigit(cs[i]))
                containDigit = true;
            else
                containOther = true;
        }

        return containLowerCase && containUpperCase && containDigit && containOther;
    }

}
