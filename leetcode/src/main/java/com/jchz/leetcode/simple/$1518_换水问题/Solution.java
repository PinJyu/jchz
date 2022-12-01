package com.jchz.leetcode.simple.$1518_换水问题;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-08 18:24
 */
public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        while (numBottles >= numExchange) {

            int rest = numBottles % numExchange;
            sum += numBottles - rest;
            numBottles /= numExchange;
            numBottles += rest;
        }

        return sum + numBottles;
    }
}
