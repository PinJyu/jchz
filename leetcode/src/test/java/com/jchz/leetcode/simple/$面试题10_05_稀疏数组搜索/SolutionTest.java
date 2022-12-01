package com.jchz.leetcode.simple.$面试题10_05_稀疏数组搜索;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findString() {
        new Solution().findString(
                new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""},
        "ta"
        );
    }
}