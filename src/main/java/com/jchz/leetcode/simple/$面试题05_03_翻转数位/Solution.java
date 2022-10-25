package com.jchz.leetcode.simple.$面试题05_03_翻转数位;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 18:52
 * @see
 * @since
 */
public class Solution {
    public int reverseBits(int num) {
        int cur = 0, reverse = 0, max = 0;

        for (int i = 0; i < 32; i++) {
            if ((num & 1) == 1) {
                cur++;
                reverse++;
            }
            else {
                reverse = cur + 1;
                cur = 0;
            }
            max = Math.max(max, reverse);
            num >>= 1;
        }

        return max;
    }


}
