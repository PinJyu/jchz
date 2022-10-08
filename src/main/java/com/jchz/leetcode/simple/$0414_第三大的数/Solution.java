package com.jchz.leetcode.simple.$0414_第三大的数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 10:29
 */
public class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null, second = null, third = null;
        for (int num : nums) {
            if (max == null || num >= max) {
                if (max != null && num == max)
                    continue;
                Integer t1 = max;
                Integer t2 = second;
                max = num;
                second = t1;
                third = t2;
            }
            else if (second == null || num >= second) {
                if (second != null && num == second) continue;
                Integer t = second;
                second = num;
                third = t;
            }
            else if (third == null || num >= third) {
                third = num;
            }
        }

        return third == null ? max == null ? -1 : max : third;
    }
}
