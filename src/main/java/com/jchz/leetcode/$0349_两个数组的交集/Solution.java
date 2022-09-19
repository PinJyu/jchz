package com.jchz.leetcode.$0349_两个数组的交集;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 16:53
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            distinctSet.add(nums1[i]);
        }

        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (distinctSet.remove(nums2[i])) {
                res.add(nums2[i]);
            }
        }

        int size = res.size();
        int[] r = new int[size];
        int i = 0;
        for (Integer re : res) {
            r[i] = re;
            i++;
        }

        return r;
    }

}
