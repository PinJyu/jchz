package com.jchz.leetcode.simple.$剑指Offer0042_连续子数组的最大和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-18 18:30
 */
public class Solution {
    class Holder {
        int lsum,  rsum,  isum,  msum;
        Holder(int lsum, int rsum, int isum, int msum) {
            this.lsum = lsum;
            this.rsum = rsum;
            this.isum = isum;
            this.msum = msum;
        }
    }
    public int maxSubArray(int[] nums) {
        return subArray(nums, 0, nums.length - 1).msum;
    }

    Holder subArray(int[] nums, int l, int r) {
        if (l == r)
            return new Holder(nums[l], nums[l], nums[l], nums[l]);

        int mid = l + (r - l) / 2;
        Holder lh = subArray(nums, l, mid);
        Holder rh = subArray(nums, mid + 1, r);

        int lsum = Math.max(lh.lsum, lh.isum + rh.lsum);
        int rsum = Math.max(rh.rsum, rh.isum + lh.rsum);
        int isum = lh.isum + rh.isum;
        int msum = Math.max(Math.max(lh.msum, rh.msum), lh.rsum + rh.lsum);

        return new Holder(lsum, rsum, isum, msum);
    }

    public int maxSubArray_1(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, num);
            if (sum < 0) {
                sum = 0;
            }
            else {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
