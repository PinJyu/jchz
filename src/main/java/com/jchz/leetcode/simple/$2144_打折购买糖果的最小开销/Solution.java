package com.jchz.leetcode.simple.$2144_打折购买糖果的最小开销;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:34
 * @see
 * @since
 */
public class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        for (int i = cost.length - 1; i >= 0; i -= 3) {
            sum += cost[i];
            if (i - 1 >= 0)
                sum += cost[i - 1];
        }

        return sum;
    }
}
