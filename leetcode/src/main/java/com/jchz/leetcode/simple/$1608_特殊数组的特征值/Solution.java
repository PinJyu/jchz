package com.jchz.leetcode.simple.$1608_特殊数组的特征值;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-09 17:40
 */
public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
    outter:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums.length - i) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] >= nums.length - i) {
                        continue outter;
                    }
                }
                return nums.length - i;
            }
        }

        return -1;
    }
}
