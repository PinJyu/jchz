package com.jchz.leetcode.middle.$2391_收集垃圾的最少总时间;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-27 17:05
 */
public class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum = 0;
        String[] clazzs = new String[]{"M", "P", "G"};
        for (String clazz : clazzs) {
            sum += collect(garbage, travel, clazz);
        }

        return sum;
    }

    int collect(String[] garbage, int[] travel, String clazz) {
        int end = -1;
        for (int i = garbage.length - 1; i >= 0; i--) {
            if (garbage[i].contains(clazz)) {
                end = i;
                break;
            }
        }

        if (end < 0)
            return 0;


        int sumt = 0, sumg = 0;
        for (int i = 0; i < end; i++) {
            sumt += travel[i];
        }

        char c = clazz.charAt(0);
        for (int i = 0; i <= end; i++) {
            for (char j : garbage[i].toCharArray()) {
                if (j == c)
                    sumg++;
            }
        }

        return sumt + sumg;
    }
}
