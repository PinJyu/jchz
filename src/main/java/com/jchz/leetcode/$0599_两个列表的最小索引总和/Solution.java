package com.jchz.leetcode.$0599_两个列表的最小索引总和;

import java.util.*;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 17:45
 */
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list2.length; i++) {
            if (map1.containsKey(list2[i])) {
                int index = map1.get(list2[i]);
                if (index + i < min) {
                    min = index + i;
                    res.clear();
                    res.add(list2[i]);
                }
                else if (index + i == min) {

                    res.add(list2[i]);
                }
            }
        }

        return res.toArray(new String[]{});
    }
}
