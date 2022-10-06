package com.jchz.leetcode.$1313_解压缩编码列表;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 20:09
 */
public class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                res.add(nums[i + 1]);
            }
        }

        int[] ret = new int[res.size()];

        for (int i = 0; i < ret.length; i++) {
            ret[i] = res.get(i);
        }

        return ret;
    }
}
