package com.jchz.leetcode.$1475_商品折扣后的最终价格;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void finalPrices() {
        int[] prices = {8,4,6,2,3};
        Solution solution = new Solution();
        int[] ints = solution.finalPrices(prices);
        System.out.println(Arrays.toString(ints));
    }
}