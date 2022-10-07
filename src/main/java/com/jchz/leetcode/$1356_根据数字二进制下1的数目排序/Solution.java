package com.jchz.leetcode.$1356_根据数字二进制下1的数目排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Desc Solution
 * @Date 2022-10-07 02:15
 * @Auth pyu
 */
public class Solution {

    public int[] sortByBits(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int i : arr) {
            l.add(i);
        }
        l.sort(
                 (x, y) -> {
                    int xc = Integer.bitCount((Integer) x);
                    int yc = Integer.bitCount((Integer) y);
                    if (xc == yc)
                        return Integer.compare((Integer) x, (Integer) y);
                    else
                        return Integer.compare(xc, yc);

                }

        );

        int[] r = new int[arr.length];

        for (int i = 0; i < l.size(); i++) {
            r[i] = l.get(i);
        }

        return r;
    }

}
