package com.jchz.leetcode.simple.$面试题16_17_连续数列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 16:16
 */
public class Solution {

    class Holder {
        int lsum, rsum, isum, msum;
        Holder(int lsum, int rsum, int isum, int msum) {
            this.lsum = lsum;
            this.rsum = rsum;
            this.isum = isum;
            this.msum = msum;
        }
    }

    public int maxSubArray(int[] nums) {
        return distribute(nums, 0, nums.length - 1).msum;
    }

    Holder distribute(int[] arr, int l, int r) {
        if (l == r) {
            return new Holder(arr[l], arr[l], arr[l], arr[l]);
        }

        int m = (l + r) / 2;
        Holder lh = distribute(arr, l, m);
        Holder rh = distribute(arr, m + 1, r);

        int lsum = Math.max(lh.lsum, lh.isum + rh.lsum);
        int rsum = Math.max(rh.rsum, rh.isum + lh.rsum);
        int isum = lh.isum + rh.isum;
        int msum = Math.max(Math.max(lh.msum, rh.msum), lh.rsum + rh.lsum);

        return new Holder(lsum, rsum, isum, msum);
    }


    public int maxSubArray_2(int[] nums) {
        int max = Integer.MIN_VALUE, pre = 0;
        for (int i : nums) {
            pre = Math.max(pre + i, i);
            max = Math.max(pre, max);
        }

        return max;
    }

//    public int maxSubArray_1(int[] nums) {
//        int max = Integer.MIN_VALUE, sum = 0;
//
//        for (int i : nums) {
//            sum += i;
//            max = Math.max(max, sum);
//            if (sum < 0)
//                sum = 0;
//        }
//
//        return max;
//    }
}
