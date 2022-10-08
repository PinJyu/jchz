package com.jchz.leetcode.simple.$1018_可被5整除的二进制前缀;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-04 18:38
 */
public class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> res = new ArrayList<>();
        int root = 0;
        for (int num : nums) {
            int root_ = ((root << 1) + num) % 5;
            res.add(root_ == 0);
            root = root_;

        }

        return res;
    }
    // 0 101 1010 1111 10100 11001 11110 100011
}
