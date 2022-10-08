package com.jchz.leetcode.simple.$0698_unresolve_划分为k个相等的子集;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 17:52
 */
public class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
//        int sum = 0;
//        for (int num : nums) {
//            sum += num;
//        }
//        if (sum % k != 0) {
//            return false;
//        }
//
//        int avg = sum / k;
//        Arrays.sort(nums);
//
//        List<Integer> s = new ArrayList<>();
//        for (int num : nums) {
//            if (num == avg) {
//
//            }
//            else {
//                for (int i = 0; i < s.size(); i++) {
//                    int cur = s.get(i);
//                    if (cur + num > avg) {
//                        return false;
//                    }
//                    else if (cur + num < avg) {
//                        num += cur;
//                    }
//                }
//            }
//        }
        return true;
    }
}
