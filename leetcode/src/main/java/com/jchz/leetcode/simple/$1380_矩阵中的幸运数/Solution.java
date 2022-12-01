package com.jchz.leetcode.simple.$1380_矩阵中的幸运数;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 16:04
 * @see
 * @since
 */
public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE, minIndex = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                int v = matrix[i][j];
                if (v < min) {
                    min = v;
                    minIndex = j;
                }
            }

            int max = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                int v = matrix[k][minIndex];
                if (v > max) {
                    max = v;
                }
            }

            if (min == max) {
                return Collections.singletonList(min);
            }
        }

        return Collections.emptyList();
    }
}
