package com.jchz.leetcode.simple.$2200_找出数组中的所有K近邻下标;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:48
 */
public class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ret = new ArrayList<>();
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int l = Math.max(r, i - k);
                r = Math.min(nums.length - 1, i + k);
                for (int j = l; j <= r; j++) {
                    if (ret.size() == 0 || j > ret.get(ret.size() - 1))
                        ret.add(j);
                }
            }
        }

        return ret;
    }
}
