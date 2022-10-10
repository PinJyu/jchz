package com.jchz.leetcode.simple.$1822_数组元素积的符号;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:56
 * @see
 * @since
 */
public class Solution {
    public int arraySign(int[] nums) {
        int negetiveCount = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;

            if (num < 0)
                negetiveCount++;
        }


        return negetiveCount % 2 == 0 ? 1 : -1;
    }
}
