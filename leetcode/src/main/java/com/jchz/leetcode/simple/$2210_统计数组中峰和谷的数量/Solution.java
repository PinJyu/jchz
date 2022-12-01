package com.jchz.leetcode.simple.$2210_统计数组中峰和谷的数量;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 12:12
 */
public class Solution {
    public int countHillValley_1(int[] nums) {
        int up = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                if (up == 1)
                    count++;
                up = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                if (up == 2)
                    count++;
                up = 2;
            }
        }

        return count;
    }
    public int countHillValley(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i - 1];
            if (diff != 0)
                l.add(diff);
        }

        int count = 0;
        for (int i = 1; i < l.size(); i++) {
            if ((l.get(i) ^ l.get(i - 1)) < 0)
                count++;
        }

        return count;
    }
}
