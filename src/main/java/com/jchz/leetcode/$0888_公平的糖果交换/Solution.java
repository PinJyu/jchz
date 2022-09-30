package com.jchz.leetcode.$0888_公平的糖果交换;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-30 17:02
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().fairCandySwap(new int[]{1,2,5}, new int[]{2,4});
    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> bobSet = new HashSet<>();

        int sum = 0;
        for (int i : aliceSizes) {
            sum += i;
        }

        for (int i : bobSizes) {
            bobSet.add(i);
            sum -= i;
        }

        int diff = sum / 2;

        for (int i : aliceSizes) {
            if (bobSet.contains(i - diff))
                return new int[]{i, i - diff};
        }
        return null;
    }
}
