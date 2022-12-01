package com.jchz.leetcode.simple.$0922_按奇偶排序数组II;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 17:57
 */
public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == i % 2)
                continue;
            if (i % 2 == 0)
                odd.add(i);
            else
                even.add(i);
        }


        for (int i = 0; i < odd.size(); i++) {
            Integer o = odd.get(i);
            Integer e = even.get(i);
            int t = nums[o];
            nums[o] = nums[e];
            nums[e] = t;
        }

        return nums;
    }
}
