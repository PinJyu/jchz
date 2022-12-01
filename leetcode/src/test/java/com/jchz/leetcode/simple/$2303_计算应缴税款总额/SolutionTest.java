package com.jchz.leetcode.simple.$2303_计算应缴税款总额;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void calculateTax() {
        new Solution().calculateTax(
                new int[][]{{3,50},{7,10},{12,25}},
        10);
    }
}