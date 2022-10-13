package com.jchz.leetcode.simple.$2042_检查句子中的数字是否递增;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 19:58
 * @see
 * @since
 */
public class Solution {
    public boolean areNumbersAscending(String s) {
        char[] cs = s.toCharArray();
        String last = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {

            if (Character.isDigit(cs[i])) {
                sb.append(cs[i]);
            }
            if (i == cs.length - 1 || cs[i + 1] == ' ') {
                if (sb.length() > 0) {
                    if (last == null)
                        last = sb.toString();
                    else {
                        String t = sb.toString();
                        if (t.length() < last.length())
                            return false;
                        else if (t.length() == last.length() && t.compareTo(last) < 1)
                            return false;
                        else
                            last = t;
                    }
                    sb = new StringBuilder();
                }
            }

        }

        return true;
    }
}
