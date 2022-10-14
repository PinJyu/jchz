package com.jchz.leetcode.simple.$2367_算术三元组的数目;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 00:02
 * @see
 * @since
 */
public class Solution {
    public int arithmeticTriplets_1(int[] nums, int diff) {
        int[] map = new int[201];
        int count = 0;
        for (int i : nums) {
            map[i]++;
        }
        for (int j : nums) {
            if (j - diff >= 0 && j + diff <= 200 && map[j - diff] > 0 && map[j + diff] > 0)
                count++;
        }

        return count;
    }

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int ij = nums[j] - nums[i];
                if (ij == diff) {
                    for (int k = j + 1; k < nums.length; k++) {
                        int kj = nums[k] - nums[j];
                        if (kj == diff)
                            count++;
                        else if (kj > diff)
                            break;
                    }
                }
                else if (ij > diff)
                    break;
            }
        }

        return count;
    }

}
