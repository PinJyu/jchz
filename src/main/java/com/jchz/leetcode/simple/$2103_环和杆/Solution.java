package com.jchz.leetcode.simple.$2103_环和杆;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:22
 * @see
 * @since
 */
public class Solution {
    public int countPoints(String rings) {
        int[] map = new int[10];
        char[] cs = rings.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i += 2) {
            char color = cs[i];
            int postion = cs[i + 1] - '0';
            int v = color == 'R' ? 1 : color == 'G' ? 2 : color == 'B' ? 4 : -1;
            map[postion] |= v;
            if (map[postion] == 7) {
                map[postion] = -1;
                count++;
            }
        }

        return count;
    }

}
