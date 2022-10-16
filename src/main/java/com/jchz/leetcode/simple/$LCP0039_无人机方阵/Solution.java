package com.jchz.leetcode.simple.$LCP0039_无人机方阵;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 16:12
 * @see
 * @since
 */
public class Solution {
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        int m = source.length, n = source[0].length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : source) {
            for (int j = 0; j < n; j++) {
                map.put(ints[j], map.getOrDefault(ints[j], 0) + 1);
            }
        }

        int count = 0;

        for (int[] arr : target) {
            for (int i = 0; i < n; i++) {
                Integer integer = map.remove(arr[i]);
                if (integer == null)
                    count++;
                else if (integer - 1 > 0)
                    map.put(arr[i], integer - 1);

            }
        }

        return count;
    }

}
