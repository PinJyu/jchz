package com.jchz.leetcode.middle.$0016_最接近的三数之和;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-28 15:06
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int wish = target - nums[i];
            int l = i + 1, r = nums.length;
            while (l < r) {
                int sum = nums[l] + nums[r];
                res = Math.abs(target - res) > Math.abs(wish - sum) ? nums[i] + sum : res;
                if (sum == wish)
                    return target;
                else if (sum > wish) {
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    r--;
                }
                else {
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    l++;
                }
            }
        }

        return res;
    }
}
