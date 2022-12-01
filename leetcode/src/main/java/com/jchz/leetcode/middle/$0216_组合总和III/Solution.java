package com.jchz.leetcode.middle.$0216_组合总和III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-02 19:24
 */
public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < (1 << 9); i++) {
            int count = 0, sum = 0;
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                if ((i & (1 << j)) != 0) {
                    String s = Integer.toBinaryString(i);
                    count++;
                    if (count <= k) {
                        li.add(j + 1);
                        sum += j + 1;
                    }
                }
            }
            if (sum == n && count == k)
                ans.add(li);
        }

        return ans;
    }
}
