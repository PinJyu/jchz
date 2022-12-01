package com.jchz.leetcode.simple.$1512_好数对的数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-08 18:18
 */
public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] map = new int[101];
        int sum = 0;

        for (int num : nums) {
            int i = map[num];
            map[num]++;
            sum += i;
        }


        return sum;
    }
}
