package com.jchz.leetcode.simple.$1646_获取生成数组中的最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 22:18
 * @see
 * @since
 */
public class Solution {
    public int getMaximumGenerated(int n) {
        List<Integer> l = new ArrayList<>(Arrays.asList(0, 1));
        if (n < 2)
            return l.get(n);

        int max = Integer.MIN_VALUE;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                l.add(l.get(i / 2));
            }
            else {
                l.add(l.get((i - 1) / 2) + l.get((i - 1) / 2 + 1));
            }

            max = Math.max(max, l.get(i));
        }

        return l.get(l.size() - 1);
    }
}
