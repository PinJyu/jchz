package com.jchz.leetcode.simple.$2404_出现最频繁的偶数元素;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 22:54
 * @see
 * @since
 */
public class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int minEven = Integer.MAX_VALUE, count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                Integer cnt = map.get(i);
                if (cnt > count) {
                    minEven = i;
                    count = cnt;
                }
                else if (cnt == count && i < minEven) {
                    minEven = i;
                }

            }
        }


        return count == 0 ? -1 : minEven;
    }

}
