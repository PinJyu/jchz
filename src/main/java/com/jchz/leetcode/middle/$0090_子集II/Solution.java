package com.jchz.leetcode.middle.$0090_子集II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-31 15:21
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        outer:
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && nums[j] == nums[j - 1] && (i & (1 << (j - 1))) == 0)
                        continue outer;
                    li.add(nums[j]);
                }
            }
            ans.add(li);
        }

        return ans;
    }
}
