package com.jchz.leetcode.simple.$1684_统计一致字符串的数目;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 11:46
 */
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int[] map = new int[26];
        for (char c : allowed.toCharArray()) {
            map[c]++;
        }
    outter:
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (map[c] > 0)
                    continue outter;
            }
            count++;
        }

        return count;
    }
}
