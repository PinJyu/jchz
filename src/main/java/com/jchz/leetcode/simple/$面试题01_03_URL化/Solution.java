package com.jchz.leetcode.simple.$面试题01_03_URL化;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 15:43
 * @see
 * @since
 */
public class Solution {

    public String replaceSpaces(String S, int length) {
        char[] cs = S.toCharArray(), ret = new char[cs.length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isLetter(cs[i])) {
                ret[index++] = cs[i];
            }
            else if (cs[i] == ' ') {
                ret[index++] = '%';
                ret[index++] = '2';
                ret[index++] = '0';
            }
        }

        return new String(ret);
    }

}
