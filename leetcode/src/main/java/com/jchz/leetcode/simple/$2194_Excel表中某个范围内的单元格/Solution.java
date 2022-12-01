package com.jchz.leetcode.simple.$2194_Excel表中某个范围内的单元格;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:41
 */
public class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ret = new ArrayList<>();
        char[] cs = s.toCharArray();
        for (char i = cs[0]; i <= cs[3]; i++) {
            for (char j = cs[1]; j <= cs[4]; j++) {
                ret.add(new String(new char[]{i, j}));
            }
        }

        return ret;
    }
}
