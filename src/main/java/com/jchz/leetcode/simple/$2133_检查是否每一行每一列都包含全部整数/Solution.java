package com.jchz.leetcode.simple.$2133_检查是否每一行每一列都包含全部整数;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 23:04
 * @see
 * @since
 */
public class Solution {
    public boolean checkValid(int[][] matrix) {
        int xl = matrix.length, yl = matrix[0].length;
        int sum = (1 + yl) * xl / 2;
        int[] map1 = new int[101];

        for (int i = 0; i < xl; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < yl; j++) {
                map1[j] += matrix[i][j];
                set.add(matrix[i][j]);
                if (i == xl - 1 && map1[j] != sum)
                    return false;
                if (j == yl - 1 && set.size() != xl)
                    return false;
            }
        }

        return true;
    }
}
