package com.jchz.leetcode.simple.$剑指Offer0050_第一个只出现一次的字符;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-19 15:57
 */
public class Solution {

    public char firstUniqChar(String s) {
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = cs.length - 1; i >= 0; i--) {
            Integer count = map.getOrDefault(i, 0);
            map.put(cs[i], map.getOrDefault(cs[i], 0) + 1);
        }

        for (char c : cs) {
            if (map.get(c) == 1)
                return c;
        }

        return ' ';
    }
}
