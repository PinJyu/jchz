package com.jchz.leetcode.simple.$2032_至少在两个数组中出现的值;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 17:45
 */
public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ret = new ArrayList<>();
        int[] map = new int[101];
        int len = Math.max(Math.max(nums1.length, nums2.length), nums3.length);

        for (int i = 0; i < len; i++) {
            if (i < nums1.length) {
                int v = nums1[i];
                map[v] |= 1;
                if (map[v] > 1 && map[v] != -1) {
                    ret.add(v);
                    map[v] = -1;
                }
            }
            if (i < nums2.length) {
                int v = nums2[i];
                map[v] |= 2;
                if (map[v] > 2 && map[v] != -1) {
                    ret.add(v);
                    map[v] = -1;
                }
            }
            if (i < nums3.length) {
                int v = nums3[i];
                map[v] |= 4;
                if (map[v] > 4 && map[v] != -1) {
                    ret.add(v);
                    map[v] = -1;
                }
            }
        }

        return ret;
    }
}
