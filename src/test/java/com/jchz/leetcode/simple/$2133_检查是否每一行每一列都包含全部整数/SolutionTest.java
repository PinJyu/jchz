package com.jchz.leetcode.simple.$2133_检查是否每一行每一列都包含全部整数;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkValid() {
        new Solution().checkValid(new int[][]{{ 1,2,3 },{ 3,1,2 },{ 2,3,1 }});

    }
}