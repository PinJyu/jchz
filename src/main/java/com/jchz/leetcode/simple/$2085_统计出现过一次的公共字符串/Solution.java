package com.jchz.leetcode.simple.$2085_统计出现过一次的公共字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 23:03
 * @see
 * @since
 */
public class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : words1) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {

            Integer count = map1.get(s);
            if (count != null && count == 1) {
                map2.put(s, map2.getOrDefault(s, 0) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1)
                count++;
        }

        return count;
    }
}
