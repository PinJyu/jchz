package com.jchz.leetcode.simple.$面试题17_16_按摩师;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 17:55
 */
public class Solution {

    public int massage(int[] nums) {

        int choose = 0, notChoose = 0;

        for (int i : nums) {
            int t = choose;
            choose = notChoose + i;
            notChoose = Math.max(t, notChoose);
        }

        return Math.max(choose, notChoose);
    }



}
