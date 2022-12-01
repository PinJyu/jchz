package com.jchz.leetcode.simple.$0575_分糖果;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 14:19
 */
public class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> types = new HashSet<>();

        for (int i : candyType) {
            types.add(i);
        }

        return Math.min(candyType.length / 2, types.size());
    }
}
