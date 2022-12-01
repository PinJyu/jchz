package com.jchz.leetcode.simple.$2399_检查相同字母间的距离;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 01:45
 * @see
 * @since
 */
public class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] map = new int[26];
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (map[cs[i] - 'a'] == 0)
                map[cs[i] - 'a'] = i + 1;
            else {
                if ((i - map[cs[i] - 'a']) != distance[cs[i] - 'a'])
                    return false;
            }
        }

        return true;
    }

}
