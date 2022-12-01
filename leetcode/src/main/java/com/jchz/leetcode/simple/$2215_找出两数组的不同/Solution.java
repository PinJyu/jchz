package com.jchz.leetcode.simple.$2215_找出两数组的不同;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 14:24
 */
public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(), set_1 = new HashSet<>(), set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
            set_1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        set1.removeAll(set2);
        set2.removeAll(set_1);
        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}
