package com.jchz.leetcode.simple.$1971_寻找图中是否存在路径;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void validPath() {
        new Solution().validPath(10 , new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}}, 5, 9);
    }
}