package com.jchz.leetcode.$1346_检查整数及其两倍数是否存在;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 23:12
 */
public class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i : arr) {
           set.add(i);
           if (i == 0)
               count++;
        }
        if (count > 1)
            return true;

        for (int i : arr) {
            if (set.contains(i * 2))
                return true;
        }

        return false;
    }
}
