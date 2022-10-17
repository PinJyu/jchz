package com.jchz.leetcode.simple.$1995_统计特殊四元组;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 14:54
 */
public class Solution {
    public int countQuadruplets(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = nums.length - 1; l > k; l--) {
                        int s = nums[i] + nums[j] + nums[k];
                        if (s == nums[l])
                            count++;
                        if (s > nums[l])
                            break;
                    }
                }
            }
        }

        return count;
    }
}
