package com.jchz.leetcode.simple.$1389_按既定顺序创建目标数组;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 16:49
 * @see
 * @since
 */
public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> r = new ArrayList<>();

        for (int num : nums) {
            r.add(-1);
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int in = index[i];
            r.add(in, n);
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = r.get(i);
        }

        return res;
    }
}
