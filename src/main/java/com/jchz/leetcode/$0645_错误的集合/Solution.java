package com.jchz.leetcode.$0645_错误的集合;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 13:38
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        Set<Integer> distinctSet = new HashSet<>();

        boolean isFind = false;
        int[] res = new int[2];
        for (int num : nums) {
            sum -= num;
            if (!isFind && !distinctSet.add(num)) {
                res[0] = num;
                isFind = true;
            }
        }

        res[1] = res[0] + sum;

        return res;

    }
}
