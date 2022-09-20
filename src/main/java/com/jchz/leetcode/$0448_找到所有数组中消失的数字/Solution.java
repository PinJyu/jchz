package com.jchz.leetcode.$0448_找到所有数组中消失的数字;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 11:49
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] bs = new int[nums.length + 1];

        for (int num : nums) {
            bs[num] = 1;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < bs.length + 1; i++) {
            if (bs[i] == 0)
                res.add(i);
        }

        return res;
    }
}
