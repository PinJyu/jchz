package com.jchz.leetcode.$0728_自除数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 11:46
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

    outter:
        for (int i = left; i <= right; i++) {
            int j = i;
            while (j > 0) {
                int mode = j % 10;
                j /= 10;

                if (mode == 0 || i % mode != 0)
                    continue outter;
            }
            res.add(i);
        }

        return res;
    }
}
