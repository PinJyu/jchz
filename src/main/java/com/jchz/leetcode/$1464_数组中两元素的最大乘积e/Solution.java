package com.jchz.leetcode.$1464_数组中两元素的最大乘积e;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:54
 * @see
 * @since
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > second) {
                if (i >= first) {
                    second = first;
                    first = i;
                }
                else {
                    second = i;
                }
            }
        }

        return (first - 1) * (second - 1);
    }
}
