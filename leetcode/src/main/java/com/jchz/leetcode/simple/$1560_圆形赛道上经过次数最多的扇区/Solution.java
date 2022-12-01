package com.jchz.leetcode.simple.$1560_圆形赛道上经过次数最多的扇区;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-08 22:52
 * @see
 * @since
 */
public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] count = new int[n + 1];
        count[rounds[0]]++;
        for (int i = 0; i < rounds.length - 1; i++) {
           int begin = rounds[i], end = rounds[i + 1], mode = 0;
           while (mode != end) {
               mode = ++begin % n;
               if (mode == 0) mode = n;
               count[mode]++;
           }
        }

        int max = Integer.MIN_VALUE;
        List<Integer> ret = new ArrayList<>();

        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ret = new ArrayList<>();
                ret.add(i);
            }
            else if (count[i] == max){
                ret.add(i);
            }
        }

        return ret;
    }
}
