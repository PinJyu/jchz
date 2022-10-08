package com.jchz.leetcode.simple.$1460_通过翻转子数组使两个数组相等;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:31
 * @see
 * @since
 */
public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : target) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : arr) {
            Integer integer = map.get(i);
            if (integer == null || integer == 0) {
                return false;
            }
            else {
                integer--;
                if (integer == 0)
                    map.remove(i);
                else
                    map.put(i, integer);
            }
        }

        return map.size() == 0;
    }
}
