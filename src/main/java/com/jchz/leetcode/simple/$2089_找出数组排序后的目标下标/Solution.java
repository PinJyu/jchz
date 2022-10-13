package com.jchz.leetcode.simple.$2089_找出数组排序后的目标下标;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 23:14
 * @see
 * @since
 */
public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessCount = 0, targetCount = 0;
        for (int i : nums) {
            if (target == i)
                targetCount++;
            else if (i < target)
                lessCount++;
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < targetCount; i++) {
            ret.add(lessCount + i);
        }


        return ret;
    }

}
