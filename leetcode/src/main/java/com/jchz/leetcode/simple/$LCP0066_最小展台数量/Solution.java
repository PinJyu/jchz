package com.jchz.leetcode.simple.$LCP0066_最小展台数量;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 20:51
 */
public class Solution {
    public int minNumBooths(String[] demand) {
        int[] sumMap = new int[26];

        for (String s : demand) {
            int[] map = new int[26];
            for (char c : s.toCharArray()) {
                map[c - 'a']++;
            }

            for (int i = 0; i < sumMap.length; i++) {
                sumMap[i] = Math.max(sumMap[i], map[i]);
            }
        }

        int count = 0;
        for (int i : sumMap) {
            count += i;
        }

        return count;
    }
}
