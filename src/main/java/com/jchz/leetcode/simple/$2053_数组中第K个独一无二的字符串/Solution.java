package com.jchz.leetcode.simple.$2053_数组中第K个独一无二的字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 21:03
 * @see
 * @since
 */
public class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : arr) {
            if (map.get(s) == 1) {
                k--;
                if (k == 0)
                    return s;
            }
        }

        return "";
    }
}
