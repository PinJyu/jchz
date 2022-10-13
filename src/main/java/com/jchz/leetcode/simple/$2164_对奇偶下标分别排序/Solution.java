package com.jchz.leetcode.simple.$2164_对奇偶下标分别排序;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 00:02
 * @see
 * @since
 */
public class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new LinkedList<>(), odd = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                odd.add(nums[i]);
            else
                even.add(nums[i]);
        }

        even.sort(Integer::compare);
        odd.sort(Integer::compare);
        int[] ret = new int[nums.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = i % 2 == 0 ? odd.remove(0) : even.remove(even.size() - 1);
        }

        return ret;
    }
}
