package com.jchz.leetcode.simple.$1668_最大重复子字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 23:15
 * @see
 * @since
 */
public class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0, max = 0;

        char[] cs = sequence.toCharArray();
        char[] cs_ = word.toCharArray();
        outter:
        for (int i = 0; i < cs.length; i++) {
            for (int j = 0; j < cs_.length; j++) {
                if (i + j >= cs.length) {
                    break outter;
                }
                if (cs[i + j] != cs_[j]) {
                    if (count > 0)
                        i = Math.max(i - cs_.length, 0);
                    count = 0;
                    continue outter;
                }
            }
            i += cs_.length - 1;
            count++;
            max = Math.max(max, count);
        }

        return max;
    }
}
