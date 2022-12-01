package com.jchz.leetcode.simple.$0643_子数组最大平均数I;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 13:14
 */
public class Solution {

    public static void main(String[] args) {
        double maxAverage = new Solution().findMaxAverage(new int[]{-1}, 1);
        System.out.println(maxAverage);
    }
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j < k; j++) {
            sum += nums[j];
        }
        max = Math.max(max, sum);

        for (int i = 1; i < nums.length - k + 1; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
