package com.jchz.leetcode.simple.$2379_得到K个黑块的最少涂色次数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 00:44
 * @see
 * @since
 */
public class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] cs = blocks.toCharArray();
        int countW = 0;
        for (int i = 0; i < k; i++) {
            if (cs[i] == 'W')
                countW++;
        }
        int min = countW;
        for (int i = 1; i + k - 1 < cs.length; i++) {
            if (cs[i - 1] == 'W')
                countW--;
            if (cs[i + k - 1] == 'W')
                countW++;
            min = Math.min(min, countW);
        }
        return min;
    }

}
