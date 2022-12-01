package com.jchz.leetcode.middle.$0003_无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-22 16:58
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        char[] cs = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = cs[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            else {
                Integer index = map.get(c);
                for (int j = l; j < index + 1; j++) {
                    map.remove(cs[j]);
                }
                l = index + 1;
                map.put(c, i);
            }

            max = Math.max(max, i - l + 1);
        }

        return max;

    }
}

