package com.jchz.leetcode.$0228_汇总区间;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 17:30
 */
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums.length == 0)
            return res;

        int hope = nums[0], begin = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == hope) {
                end = i;
                hope++;
            }
            else {
                res.add(begin == end ? nums[begin] + "" : nums[begin] + "->" + nums[end]);
                hope = nums[i] + 1;
                begin = end = i;
            }

            if (i == nums.length - 1) {
                res.add(begin == end ? nums[begin] + "" : nums[begin] + "->" + nums[end]);
            }
        }

        return res;
    }

}
