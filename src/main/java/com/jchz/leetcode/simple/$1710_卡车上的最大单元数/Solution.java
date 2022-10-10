package com.jchz.leetcode.simple.$1710_卡车上的最大单元数;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 15:27
 */
public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (x, y) -> y[1] - x[1]);

        int i = 0, sum = 0;
        while (truckSize > 0 && i < boxTypes.length) {
            int boxes = Math.min(truckSize, boxTypes[i][0]);
            sum += boxes * boxTypes[i][1];
            truckSize -= boxes;
            i++;
        }

        return sum;
    }
}
