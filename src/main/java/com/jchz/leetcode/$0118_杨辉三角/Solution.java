package com.jchz.leetcode.$0118_杨辉三角;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 11:12
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            res.add(row);
            row.add(1);
            if (i == 0) continue;
            if (i == 1) {
                row.add(1);
                continue;
            }

            List<Integer> lastRow = res.get(res.size() - 2);
            for (int i1 = 0; i1 < lastRow.size() - 1; i1++) {
                row.add(lastRow.get(i1) + lastRow.get(i1 + 1));
            }

            row.add(1);
        }

        return res;
    }
}
