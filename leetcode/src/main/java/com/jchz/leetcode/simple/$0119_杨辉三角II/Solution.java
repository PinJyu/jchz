package com.jchz.leetcode.simple.$0119_杨辉三角II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 11:31
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {
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

        return res.get(res.size() - 1);
    }


    // 滚动数组
    public List<Integer> getRow_2(int rowIndex) {

        List<Integer> lastRow = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if (i == 0) {
                lastRow = row;
                continue;
            }
            if (i == 1) {
                lastRow = row;
                row.add(1);
                continue;
            }

            for (int i1 = 0; i1 < lastRow.size() - 1; i1++) {
                row.add(lastRow.get(i1) + lastRow.get(i1 + 1));
            }

            row.add(1);
            lastRow = row;
        }

        return lastRow;
    }


    // 递归
    public List<Integer> getRow_3(int rowIndex) {


        if (rowIndex == 0) return Arrays.asList(1);
        if (rowIndex == 1) return Arrays.asList(1, 1);

        List<Integer> lastRow = getRow(rowIndex - 1);

        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 0; i < lastRow.size() - 1; i++) {
            res.add(lastRow.get(i) + lastRow.get(i + 1));
        }
        res.add(1);


        return res;
    }
}
