package com.jchz.leetcode.simple.$LCP0051_烹饪料理;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void perfectMenu() {
        new Solution().perfectMenu(
new int[]                {18,17,10,18,4},
new int[][]{{2,17,20,20,0},{16,2,6,12,13},{3,8,14,20,19},{17,8,15,17,7},{3,16,20,19,18},{11,2,1,8,4}},
new int[][]{{5,3},{16,13},{12,12},{9,17},{7,14},{8,8}},
        8

        );
    }
}