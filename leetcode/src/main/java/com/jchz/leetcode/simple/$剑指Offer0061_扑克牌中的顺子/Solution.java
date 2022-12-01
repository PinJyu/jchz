package com.jchz.leetcode.simple.$剑指Offer0061_扑克牌中的顺子;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 16:02
 */
public class Solution {
    public boolean isStraight_1(int[] nums) {
        Arrays.sort(nums);
        int nzc = 0, zc = -1;
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i] > 0) {
                if (zc == -1) zc = i;
                int diff = nums[i + 1] - nums[i];
                if (diff == 0) return false;
                nzc += diff - 1;

            }
        }
        return nzc <= zc;
    }

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);

        int map = 0, mask = 1, zc = 0, next = -1;
        for (int i : nums) {
            if (i > 0) {
                if (next == -1) {
                    next = i + 1;
                    map |= mask;
                    mask <<= 1;
                }
                else {
                    while (i != next) {
                        if (zc > 0) {
                            next++;
                            zc--;
                            map |= mask;
                            mask <<= 1;
                        }
                        else
                            return false;
                    }
                    next++;
                    map |= mask;
                    mask <<= 1;
                }
            }
            else
                zc++;
        }

        return map == 0b11111;
    }
}
