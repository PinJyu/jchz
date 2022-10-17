package com.jchz.leetcode.simple.$2248_多个数组求交集;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 17:07
 */
public class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ret = new ArrayList<>();
        int[] map = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                map[i]++;
                if (map[i] == nums.length)
                    ret.add(i);
            }
        }

        return ret;
    }
}
