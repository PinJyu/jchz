package com.jchz.leetcode.middle.$1282_用户分组;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 18:29
 */
public class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ret = new ArrayList<>();
        Map<Integer, List<Integer>> map =  new HashMap<>();

        for (int j = 0; j < groupSizes.length; j++) {
            int size = groupSizes[j];
            List<Integer> l = map.computeIfAbsent(size, k -> new ArrayList<>());

            l.add(j);
            if (l.size() == size) {
                ret.add(l);
                map.remove(size);
            }
        }

        return ret;
    }
}
